import java.util.Scanner;
public class The_Red_Cross_for_each {
	public static void main(String[] args)
    {
	    int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of tents in refugee camp:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the no people in each camp:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for( int num : a)
        {
            sum = sum+num;
        }
        System.out.println("The total number of people is "+sum);
	}
}
