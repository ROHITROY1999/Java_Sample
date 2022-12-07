import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.*;
class UserMainCode
{
    static void displayDate(String dateString) throws ParseException
    {
        SimpleDateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        Date myDate = format.parse(dateString);
        SimpleDateFormat format_new = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        String formattedDate = format_new.format(myDate);
        System.out.println(formattedDate);
    }
}
public class Display_Date
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date: ");
        String dateString = sc.nextLine();
        try
        {
            UserMainCode.displayDate(dateString);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }
}
