import java.util.*;
abstract class Card
{
    protected String holderName;
    protected String cardNumber;
    protected String expiryDate;
    public Card(String holderName, String cardNumber, String expiryDate)
    {
        this.setHolderName(holderName);
        this.setCardNumber(cardNumber);
        this.setExpiryDate(expiryDate);
    }
    public void setHolderName(String newHolderName)
    {
        this.holderName = newHolderName;
    }
    public void setCardNumber(String newCardNumber)
    {
        this.cardNumber = newCardNumber;
    }
    public void setExpiryDate(String newExpiryDate)
    {
        this.expiryDate = newExpiryDate;
    }
    public String getHolderName()
    {
        return this.holderName;
    }
    public String getCardNumber()
    {
        return this.cardNumber;
    }
    public String getExpiryDate()
    {
        return this.expiryDate;
    }
}

class MembershipCard extends Card
{
    private int rating;
    public MembershipCard(String holderName, String cardNumber, String expiryDate, int rating)
    {
        super(holderName, cardNumber, expiryDate);
        this.setRating(rating);
    }
    public void setRating(int newRating)
    {
        this.rating = newRating;
    }
    public int getRating()
    {
        return this.rating;
    }
    public void display()
    {
        System.out.println(this.holderName + "'s Membership Card Details:");
        System.out.println("Card Number: " + this.cardNumber);
        System.out.println("Rating: " + this.rating);
    }
}
class Paybackcard extends Card
{
    private int pointsEarned;
    private double totalAmount;
    public Paybackcard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount)
    {
        super(holderName, cardNumber, expiryDate);
        this.setPointsEarned(pointsEarned);
        this.setTotalAmount(totalAmount);
    }
    public void setPointsEarned(int newPointsEarned)
    {
        this.pointsEarned = newPointsEarned;
    }
    public void setTotalAmount(double newTotalAmount)
    {
        this.totalAmount = newTotalAmount;
    }
    public int getPointsEarned()
    {
        return this.pointsEarned;
    }
    public double getTotalAmount()
    {
        return this.totalAmount;
    }
    public void display()
    {
        System.out.println(this.holderName + "'s Paybackcard Details:");
        System.out.println("Card Number: " + this.cardNumber);
        System.out.println("Points Earned: " + this.pointsEarned);
        System.out.println("Total Amount: " + this.totalAmount);
    }
}
public class Card_Details
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the Card\n 1.Payback Card\n 2.Membership Card");
        char ch = input.nextLine().charAt(0);
        switch(ch)
        {
            case '1':
                System.out.println("Enter the Card Details:");
                String details = input.nextLine();
                String[] arrDetails = details.split("\\|");
                System.out.println("Enter points in card:");
                int points = input.nextInt();
                input.nextLine();
                System.out.println("Enter Amount:");
                double amount = input.nextDouble();
                input.nextLine();
                Paybackcard pbc = new Paybackcard(arrDetails[0], arrDetails[1], arrDetails[2], points, amount);
                pbc.display();
                break;
            case '2':
                System.out.println("Enter the Card Details:");
                String mc_details = input.nextLine();
                String[] arrMC_Details = mc_details.split("\\|");
                System.out.println("Enter rating");
                int rating = input.nextInt();
                input.nextLine();
                MembershipCard mc = new MembershipCard(arrMC_Details[0], arrMC_Details[1], arrMC_Details[2], rating);
                mc.display();
                break;
            default:
                System.out.println("WRONG CHOICE");
                break;
        }
    }
}
