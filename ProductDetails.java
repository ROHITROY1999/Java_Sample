import java.util.Scanner;
class Product {
	private long id;
	private String productName;
	private String supplierName;
	
	public void setProduct(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	public long getID() {
		System.out.print("Product ID is: ");
		return(this.id);
	}
	public String getProductName()
	{
		return("Product Name is "+ this.productName);
	}
	
	public String getSupplierName()
	{
		return("Supplier Name is " + this.supplierName);
	}
}
public class ProductDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product id");
		long id = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the product name");
		String productName = sc.nextLine();
		System.out.println("Enter the supplier name");
		String supplierName = sc.nextLine();
		Product PD = new Product();
		PD.setProduct(id, productName, supplierName);
		System.out.println(PD.getID());
		System.out.println(PD.getProductName());
		System.out.println(PD.getSupplierName());
	}
}