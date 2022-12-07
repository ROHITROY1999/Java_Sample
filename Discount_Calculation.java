import java.util.Scanner;
public class Discount_Calculation {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item 1 price");
		float item1=sc.nextFloat();
		System.out.println("Enter item 2 price");
		float item2=sc.nextFloat();
		System.out.println("Enter the discount");
		float dis=sc.nextFloat();
		float total = item1+item2;
		float discount = (1-dis/100)*total;
		System.out.println("Total Amount = $"+total);
		System.out.println("Discounted amount = $"+discount);
		float saved = total- discount;
		System.out.println("Saved amount = $"+saved);
	}
}
