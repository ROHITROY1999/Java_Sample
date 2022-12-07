import java.util.Scanner;
 class Shape
 {
	 protected String shapeName;
	 public double calculateArea()
     {
         return 0.00;
     }
     Shape(String shapeName)
    {
        this.shapeName = shapeName;
    }
 }
 class Square extends Shape
 {
     int side;
     Square(String shapeName,int side)
     {
        super(shapeName);
        this.side = side;
     }
     public double calculateArea()
     {
        return(this.side*this.side);
     }
 }
 class Rectangle extends Shape
 {
    double length;
    double breadth;
    Rectangle(String shapeName, int length, int breadth)
    {
    	super(shapeName);
        this.length = length;
        this.breadth = breadth;
    }
    public double calculateArea()
    {
	  return(this.length * this.breadth);
    }
}
 class Circle extends Shape
 {
	int radius;
    Circle(String shapeName,int radius)
    {
        super(shapeName);
        this.radius = radius;
    }
    public double calculateArea()
    {
    	 return(Math.PI * Math.pow(radius, 2));
    }
}
public class Area_of_a_Shape
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("1: Rectangle" + "\r\n" + "2: Square" + "\r\n" + "3: Circle");
    	System.out.println("Area calculator - Choose Your Answer");
    	int choice = sc.nextInt();
    	switch(choice)
    	{
    	    case 1:
    	        System.out.println("Enter length and breadth:");
    	        int length = sc.nextInt();
    	        int breadth = sc.nextInt();
    	        Shape s1 = new Rectangle("Rectangle", length, breadth);
    	        System.out.println("Area of "+ s1.shapeName+" is :"+s1.calculateArea());
    	        break;
      	    case 2:
      		     System.out.println("Enter side :");
                 int side= sc.nextInt();
                 Shape s2 = new Square("Square", side);
                 System.out.println("Area of "+ s2.shapeName+" is :"+s2.calculateArea());
                 break;
      	    case 3:
      	         System.out.println("Enter Radius :");
                 int radius= sc.nextInt();
                 Shape s3 = new Circle("Circle", radius);
                 System.out.println("Area of "+ s3.shapeName+" is :"+s3.calculateArea());
                 break;
            default:
                 System.out.println("Wrong Choice");
                 break;
    	}
    }
}