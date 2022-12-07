import java.util.Scanner;
class Shape1
{
    protected String shapeName;
    public double calculateArea()
    {
        return 0.00;
    }
    Shape1(String shapeName)
    {
        this.shapeName = shapeName;
    }
}
class Square1 extends Shape1
{
    int side;
    Square1(String shapeName,int side)
    {
        super(shapeName);
        this.side = side;
    }
    public double calculateArea()
    {
        return(this.side*this.side);
    }
}
class Rectangle1 extends Shape1
{
    double length;
    double breadth;
    public Rectangle1(String shapeName,double length, double breadth) {
        super(shapeName);
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea()
    {
        return(this.length * this.breadth);
    }
}
class Circle1 extends Shape1
{
    int radius;
    Circle1(String shapeName,int radius)
    {
        super(shapeName);
        this.radius = radius;
    }
    public double calculateArea()
    {
        return(Math.PI * Math.pow(radius, 2));
    }
}
class Hexagon extends Shape1
{
    int sides;
    Hexagon(String shapeName,int r)
    {
        super(shapeName);
        sides = r;
    }
}
public class Area_of_a_Shape_POLY
{
    public static void main(String[] args)
    {
        Shape1 s = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Rectangle \n2. Square \n3. Circle \n4. Hexagon\n Area Caluclator -- Choose your shape");
        int option = sc.nextInt();
        switch (option)
        {
            case 1:
                System.out.println("Enter length and breadth: ");
                double length = sc.nextInt();
                double breadth=sc.nextInt();
                s = new Rectangle1("RECTANGLE",length,breadth);
                System.out.println("Area of "+s.shapeName+" is : "+s.calculateArea());
                break;
            case 2:
                System.out.println("Enter side: ");
                int side = sc.nextInt();
                s = new Square1("SQUARE",side);
                System.out.println("Area of "+s.shapeName+" is : "+s.calculateArea());
                break;
            case 3:
                System.out.println("Enter Radius: ");
                int rad = sc.nextInt();
                s = new Circle1("CIRCLE",rad);
                System.out.println("Area of "+s.shapeName+" is : "+s.calculateArea());
                break;
            case 4:
                System.out.println("Enter Side: ");
                int si = sc.nextInt();
                s = new Hexagon("HEXAGON",si);
                System.out.println("Area of "+s.shapeName+" is : "+s.calculateArea());
                break;
            default:
                System.out.println("WRONG CHOICE");
                break;
        }
        sc.close();
    }
}