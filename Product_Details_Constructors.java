import java.util.Scanner;
 class Product1{
	
	private long id;
	private String productName;
	private String supplierName;
	
	Product1()
	{
		System.out.println("Default Constructor called");
	}
	Product1(long id, String productName, String supplierName)
	{
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	public void display()
	{
		System.out.println("Product ID is: " + this.id);
		System.out.println("Product Name is: " + this.productName );
		System.out.println("Supplier Name is: " + this.supplierName );
	}
}
public class Product_Details_Constructors{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product id");
		long id = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the product name");
		String productName = sc.nextLine();
		System.out.println("Enter the supplier name");
		String supplierName = sc.nextLine();
		Product1 PD1 = new Product1(id, productName, supplierName);
		PD1.display();
	}
}
