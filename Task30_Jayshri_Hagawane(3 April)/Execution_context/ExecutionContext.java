public class ExecutionContext {

  protected String contextId  = null;
  protected String locationId = null;
  protected Object details    = null;

  protected static Map<Thread, List<ExecutionContext>> executionContexts =
    new ConcurrentHashMap<Thread, List<ExecutionContext>>();


  public static void log(String contextId, String locationId,
      Object details){

    List<ExecutionContext> executionContextListForThread =
          getExecutionContext();

    ExecutionContext executionContext = new ExecutionContext();
    executionContext.contextId  = contextId;
    executionContext.locationId = locationId;
    executionContext.details    = details;

    executionContextListForThread.add(executionContext);
  }


  public static void clearExecutionContext() {
    getExecutionContext().clear();
  }


  public static List<ExecutionContext> getExecutionContext() {

    List<ExecutionContext> executionContextListForThread =
            executionContexts.get(Thread.currentThread());

    if(executionContextListForThread == null){

        executionContextListForThread =
            new ArrayList<ExecutionContext>();

        executionContexts.put(Thread.currentThread(),
              executionContextListForThread);
    }

    return executionContextListForThread;
  }
}