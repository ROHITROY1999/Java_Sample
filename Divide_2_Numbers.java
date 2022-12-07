import java.util.*;
public class Divide_2_Numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        sc.nextLine();
        try
        {
            int quotient = a/b;
            System.out.println("The quotient of " + a + "/" + b + " = " + quotient);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide By Zero Exception caught: .. " + e.getMessage());
        }
        finally
        {
            System.out.println("Inside finally block");
        }
    }
}