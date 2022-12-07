import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort_the_Scores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of matches played by the player");
        int total = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> arr = new ArrayList<>(total);
        for (int i = 0; i < total; i++)
        {
            System.out.println("Enter runs scored by the IPL player in " + i);
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        System.out.println("Runs scored by player in sorted order "+arr);
    }
}
