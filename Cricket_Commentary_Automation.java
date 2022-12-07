import java.util.*;
class Deliveries
{
    void displayDeliveryDetails(String bowler, String batsmen)
    {
        String[] arrStr1 = bowler.split(" ");
        String[] arrStr2 = batsmen.split(" ");
        System.out.println("Player details of the delivery:");
        System.out.println("Bowler: "+arrStr1[arrStr1.length-1]);
        System.out.println("Batsman: "+arrStr2[arrStr2.length-1]);
    }
    void displayDeliveryDetails(long runs)
    {
        if(runs == 4)
        {
            System.out.println("It is a boundary");
        }
        else if (runs == 6)
        {
            System.out.println("It is a Sixer");
        }
        else {
            System.out.println("Number of runs scored in the delivery:" + runs);
        }
    }
}
public class Cricket_Commentary_Automation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu\n1. Player details of the delivery\n2. Run details of the delivery");
        char choice = sc.nextLine().charAt(0);
        Deliveries dl = new Deliveries();
        switch(choice)
        {
            case '1':
                System.out.println("Enter the bowler name");
                String bowler_name = sc.nextLine();
                System.out.println("Enter the batsman name");
                String batsmen_name = sc.nextLine();
                dl.displayDeliveryDetails(bowler_name, batsmen_name);
                break;
            case '2':
                System.out.println("Enter the number of runs");
                long runs = sc.nextLong();
                dl.displayDeliveryDetails(runs);
                break;
            default:
                System.out.println("WRONG CHOICE");
                break;
        }
    }
}
