import java.util.*;
public class Secure_URL
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println("Enter the start String");
        String str1= sc.next();
        if((str.substring(0,5)).equals(str1))
            System.out.println(str+" start with "+str1);
        else
            System.out.println(str+" does not start with "+str1);
    }
}
