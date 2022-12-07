import java.util.*;
public class Replace_Organization_Name
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the content of the document");
        String s1 = sc.nextLine();
        System.out.println("Enter the old name of the company");
        String s2 = sc.next();
        System.out.println("Enter the new name of the company");
        String s3 = sc.next();
        String newStr = s1.replaceAll(s2,s3);
        System.out.println("The content of the modified document is");
        System.out.println(newStr);
    }
}