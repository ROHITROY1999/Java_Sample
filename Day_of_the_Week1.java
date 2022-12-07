import java.util.Scanner;

public class Day_of_the_Week1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] daysWeek = new String[7];

        System.out.println("ENTER THE DAYS IN STRING ARRAY");
		for(int i=0;i<7;i++)
        {
            daysWeek[i] = sc.next();
        }

        System.out.println("Enter the day number ");
        int day = sc.nextInt();
        System.out.println("Day of the week is " +daysWeek[day-1]);

	}

}
