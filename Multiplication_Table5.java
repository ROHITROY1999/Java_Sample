import java.util.Scanner;

public class Multiplication_Table5 {
    public static void main(String[] args){
        System.out.println("Enter the multiplication table");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+" = "+n*i);
        }
    }
}
