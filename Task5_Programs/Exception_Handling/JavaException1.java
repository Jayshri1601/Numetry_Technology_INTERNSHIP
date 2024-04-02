//NullPointer Exception

public class JavaException1
{  
  public static void main(String args[])
  {  
   try
   {  
       
       String s=null; 
	   System.out.println(s.length());
   }
   catch(NullPointerException e)
   {
   System.out.println(e);
   }  
      
   System.out.println("NULL pointer Exception");  
  }  
}  

 
 