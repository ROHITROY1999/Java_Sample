import java.util.Scanner;

public class Day_of_the_Week
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Enter the day number");
        int i = sc.nextInt();
        System.out.println("Day of the week is "+s[i-1]);
    }
}
