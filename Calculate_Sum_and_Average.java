import java.lang.*;
import java.util.*;
public class Calculate_Sum_and_Average
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of matches played by the team");
        int total = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> arr = new ArrayList<>(total);
        for(int i = 0; i < total; i++)
        {
            System.out.println("Enter points scored in match "+i);
            arr.add(sc.nextInt());
        }
        int sum = 0;
        for(int i : arr)
        {
            sum += i;
        }
        System.out.println(sum);

        float average = (float)sum/(float)total;
        System.out.println(average);
    }
}