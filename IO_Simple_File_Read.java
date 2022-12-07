import java.io.File;
import java.io.FileInputStream;
import java.io.*;
import java.util.*;
public class IO_Simple_File_Read
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the file name");
            String str = sc.nextLine();
            //BufferedInputStream bs = new BufferedInputStream(new FileInputStream("C:\\Users\\Hp\\Documents\\player.txt"));
            File file = new File("C:\\Users\\Hp\\Documents\\"+str);
            FileInputStream fin = new FileInputStream(file);
            int input;
            if(file.exists())
            {
                while((input=fin.read())!= -1)
                {
                    System.out.print((char)input);
                }
                fin.close();
            }else
                System.out.println("File does not exists");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}