import java.util.Scanner;
public class Profit_and_Loss_Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of dozens of toys purchased");
		int x=sc.nextInt();
		System.out.println("Enter the price per dozen");
		int y=sc.nextInt();
		System.out.println("Enter the selling price of 1 toy");
		int z=sc.nextInt();
		A a =new A();
		float profit_per = a.calculateProfit(x,y,z);
		System.out.println("Sam's profit percentage is "+profit_per+" percentage");
	}
}
 class A
 {
	 public  float calculateProfit(int dozenCount, int pricePerDozen, int sellPrice)
		{
			float cp =  pricePerDozen/12;
			float profit = (sellPrice-cp)/cp*100;
			return profit;
		}
 }