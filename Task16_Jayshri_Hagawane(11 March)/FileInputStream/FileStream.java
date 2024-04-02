import java.io.FileInputStream;
  
class FileStream
 {  
     public static void main(String args[])
	 {    
          try
		  {    
            FileInputStream fin=new FileInputStream("D://Numetry/Task16_Jayshri_Hagawane(11 March)/FileInputStream/demo.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }    
		  System.out.println("Successfully compiled!");
     }    
 }  