import java.util.Scanner;
class LargestNo_Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++)
        {
             arr[i]= sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("Largest in given array is " + max);
        System.out.println("Smallest in given array is " + min);
    }
}