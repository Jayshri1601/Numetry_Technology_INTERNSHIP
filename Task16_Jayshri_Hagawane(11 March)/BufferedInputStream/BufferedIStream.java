import java.io.FileInputStream;
import java.io.BufferedInputStream;

class BufferedIStream{

   public static void main(String args[]) {

      try 
	  {

         FileInputStream file = new FileInputStream("D://Numetry/Task16_Jayshri_Hagawane(11 March)/BufferedInputStream/input.txt");
         
         BufferedInputStream buffer = new BufferedInputStream(file);
         System.out.println("Available bytes at the beginning: " + buffer.available());

   
         buffer.read();
         buffer.read();
         buffer.read();

        
         System.out.println("Available bytes at the end: " + buffer.available());

         buffer.close();
      }

      catch (Exception e)
	  {
         e.getStackTrace();
      }
   }
}