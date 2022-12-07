import java.util.*;
import java.util.HashMap;
 public class Max_Scorer_HashMap
 {
    public static void main(String[] args)
    {
        HashMap<String, Long> playerDetails = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String name = "";
        long score = 0;
        System.out.println("Enter the number of players:");
        int total = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < total; i++)
        {
            System.out.println("Enter the details of the player " + (i+1) + ":");
            name = sc.nextLine();
            score = sc.nextLong();
            sc.nextLine();
            playerDetails.put(name, score);
        }
        long temp = 0;
        String maxScorer = "";
        for(HashMap.Entry<String, Long> entry : playerDetails.entrySet())
        {
            if(entry.getValue() > temp)
            {
                temp = entry.getValue();
                maxScorer = entry.getKey();
            }
        }
        System.out.println(maxScorer);
    }
}