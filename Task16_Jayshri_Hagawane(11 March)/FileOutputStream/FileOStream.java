import java.io.*;
 
class FileOStream {
    public static void main(String[] args) throws IOException
    {
        int i;
        FileOutputStream fout = new FileOutputStream("D://Numetry/Task16_Jayshri_Hagawane(11 March)/FileOutputStream/demo1.txt",true);
       
        String st = "JAYSHRI";
        char ch[] = st.toCharArray();
		
        for (i = 0; i < st.length(); i++)
		{
            fout.write(ch[i]);
        }
		System.out.println("Successfully Run!");
        fout.close();
    }
}