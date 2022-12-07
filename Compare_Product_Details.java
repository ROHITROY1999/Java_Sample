import java.util.*;
class Product2
{
    private long id;
    private String productName;
    private String supplierName;
    public Product2(long id, String productName, String supplierName)
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
    public boolean equals(Product2 other)
    {
        if((this.id == other.id) && (this.productName.equals(other.productName)) && (this.supplierName.equals(other.supplierName)))
        { return true; }
        else { return false; }
    }
}
public class Compare_Product_Details
{
    void display(Product2 product)
    {
        System.out.println("Product ID is: " + product.getID());
        System.out.println("Product Name is: " + product.getProductName());
        System.out.println("Supplier Name is: " + product.getSupplierName());
    }
    public static void main(String[] args)
    {
        Compare_Product_Details cpd = new Compare_Product_Details();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id: ");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the product name: ");
        String productName = sc.nextLine();
        System.out.println("Enter the supplier name: ");
        String supplierName = sc.nextLine();
        Product2 pr1 = new Product2(id, productName, supplierName);
        cpd.display(pr1);

        System.out.println("Enter product id: ");
        long id_ = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the product name: ");
        String productName_ = sc.nextLine();
        System.out.println("Enter the supplier name: ");
        String supplierName_ = sc.nextLine();
        Product2 pr2 = new Product2(id_, productName_, supplierName_);
        cpd.display(pr2);

        if(pr1.equals(pr2))
        {
            System.out.println("The two products are same");
        }
        else {
            System.out.println("The two products are different");
        }
    }
}