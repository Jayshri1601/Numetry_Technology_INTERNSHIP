//Finally Keyword

class FinallyBlock 
{    
	public static void main(String args[])
	{    
	try
	{      
		int num=20/4;    
		System.out.println(num);    
	}    
	catch(NullPointerException e)
	{  
		System.out.println(e);  
	}    

	finally 
	{  
		System.out.println("Finally block");  
	}    
    
		System.out.println("Finally Block always executed");    
  }    
}    