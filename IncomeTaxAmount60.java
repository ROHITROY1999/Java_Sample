import java.util.*;
public class IncomeTaxAmount60 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Annual Salary");
        int salary = sc.nextInt();
        double tax=0;
        if(salary<=250000){
            tax=0.0;
        }
        else if(salary>250000 && salary<=500000){
            tax = (salary-250000)*0.05;
        }
        else if(salary>500000 && salary<=1000000){
            tax = ((salary-500000)*0.20)+12500.00;
        }
        else{
            tax = ((salary-1000000)*0.30)+12500.00+100000.00;
        }
        System.out.println("Tax Amount = "+tax);
    }
}
