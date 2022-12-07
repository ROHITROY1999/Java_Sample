import java.util.Scanner;

public class The_Red_Cross_For
{
	public static void main(String[] args) {
	    int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of tents in refugee camp:");
        n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the no people in camp: "+i);
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("The total number of people in camp is "+sum);
	}
}
