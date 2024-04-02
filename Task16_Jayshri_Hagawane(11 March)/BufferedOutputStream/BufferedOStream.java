import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

class BufferedOStream {
    public static void main(String[] args) {

        String data = "Numetry Technologies";

        try 
		{
            FileOutputStream file = new FileOutputStream("D://Numetry/Task16_Jayshri_Hagawane(11 March)/BufferedOutputStream/output.txt");

            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            output.write(array);
            output.close();
        }

        catch (Exception e) 
		{
            e.getStackTrace();
        }
		System.out.println("Successfully Run!");
    }
}