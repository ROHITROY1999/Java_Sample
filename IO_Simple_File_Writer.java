import java.io.*;
import java.util.Scanner;

class IO_Simple_File_Writer
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            File fl = new File("C:\\Users\\Hp\\Documents\\output.csv");
            FileWriter fw = new FileWriter(fl) ;
            String c=sc.nextLine();
            String str;
            while (c.equals("y")  || c.equals("Y"))
            {
                System.out.println("Enter the name of the player");
                str=sc.nextLine();
                fw.write(str);
                fw.append(",");
                System.out.println("Enter the team name");
                str=sc.nextLine();
                fw.write(str);
                fw.append(",");
                System.out.println("Enter the number of matches played");
                str=sc.nextLine();
                fw.write(str);
                fw.append(",");
                System.out.println("Do you Want to continue press y or Y");
                c= sc.nextLine();
            }
            fw.close();
        }
        catch (IOException  e)
        { e.printStackTrace(); }
    }
}
