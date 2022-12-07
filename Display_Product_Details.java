import java.util.*;
class Product3
{
    private long id;
    private String productName;
    private String supplierName;
    public Product3(long id, String productName, String supplierName)
    {
        this.setID(id);
        this.setProductName(productName);
        this.setSupplierName(supplierName);
    }
    public void setID(long newID) { this.id = newID; }
    public void setProductName(String newProductName) { this.productName = newProductName; }
    public void setSupplierName(String newSupplierName) { this.supplierName = newSupplierName; }
    public long getID() { return this.id; }
    public String getProductName() { return this.productName; }
    public String getSupplierName() { return this.supplierName; }

    public String toString()
    {
        return(this.id+ " : " + this.productName + " : " + this.supplierName);
    }
}
public class Display_Product_Details
{
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
        Product3 product = new Product3(id, productName, supplierName);
        System.out.println(product.toString());
        System.out.println("Invoking getClass() method : "+product.getClass());
    }
}