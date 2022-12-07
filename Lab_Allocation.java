import java.util.Scanner;
public class Lab_Allocation {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter seating capacity of lab L1");
		int x=sc.nextInt();
		
		System.out.println("Enter seating capacity of lab L2");
		int y=sc.nextInt();
			
	    System.out.println("Enter seating capacity of lab L3");
		int z=sc.nextInt();
		
		if(x<=y && x<=z)  
			System.out.println("L1 has the minimal capacity");  
		if(y<=x && y<=z)  
			System.out.println("L2 has the minimal capacity");   
		else  
			System.out.println("L3 has the minimal capacity");
	}
}