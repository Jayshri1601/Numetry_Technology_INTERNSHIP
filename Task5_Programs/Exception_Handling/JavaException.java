//Arithmetic Exception
//try-catch block
public class JavaException
{  
  public static void main(String args[])
  {  
   try
   {  
       
      int data=50/0;  
   }
   catch(ArithmeticException e)
   {
   System.out.println(e);
   }  
      
   System.out.println("Try block Exception Handling");  
  }  
}  