import java.util.Calendar;
import java.util.*;
class UserMainCode_31
{
    public static String getDate(Calendar cal, String givenDate)
    {
        return "20 months before " + givenDate + " will be " + cal.get(Calendar.YEAR) + "-" +
                (cal.get(Calendar.MONTH)) + "-" + cal.get(Calendar.DATE);
    }
    public static void displayDate(String givenDate)
    {
        Calendar cal = Calendar.getInstance();
        String [] strArray = givenDate.split("-");
        int year = Integer.parseInt(strArray[0]);
        int month = Integer.parseInt(strArray[1]);
        int date = Integer.parseInt(strArray[2]);
        cal.set(year, month, date);
        cal.add(Calendar.MONTH, -20);
        System.out.println(getDate(cal, givenDate));
    }
}
public class EMI_Month_Calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date in format yyyy-MM-dd: ");
        String dateString = sc.nextLine();
        UserMainCode_31.displayDate(dateString);
    }
}