import java.util.Scanner;
public class Profit_and_Loss {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of dozens of toys purchased");
		float x=sc.nextFloat();
		
		System.out.println("Enter the price per dozen");
		float y=sc.nextFloat();
		
		System.out.println("Enter the selling price of 1 toy");
		float z=sc.nextFloat();
		
		float cp = y/12;
		float profit = (z-cp)/cp*100;
		
		System.out.println("Sam's profit percentage is "+profit+" percent");
	}
}