import java.util.Scanner;

public class Profit_Calculation {

	public static void main(String[] args) {
		System.out.println("Enter buying and selling price");
		Scanner sc = new Scanner(System.in);
		
		float buy=sc.nextFloat();
		float sell=sc.nextFloat();
		
		System.out.println("Buying price is "+buy);
		System.out.println("Selling price is "+sell);
	}

}
