import java.util.Scanner;
class Trainee {
	private static final String COHERT_CODE = "CHNAJ19004";
	private int EmployeeID;
	public String Name;
	public Trainee(int id, String name)
	{
		this.EmployeeID = id;
		this.Name = name;
	}
	public int getID()
	{
		return this.EmployeeID;
	}
	public String getName()
	{
		return this.Name;
	}
	public void display()
	{
		System.out.println(getID() + " " + getName() + " " + Trainee.COHERT_CODE);
	}
}
public class GenC_Details
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of GenCs");
		int num = sc.nextInt();
		Trainee[] arr = new Trainee[num];		//object array
		
		for(int i = 0; i < num; i++) {
			System.out.println("Enter EmployeeID");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name");
			String name = sc.nextLine();
			arr[i] = new Trainee(id, name);
		}
		for(int j = 0; j < arr.length; j++) {
			arr[j].display();
			/*String s=arr[j].Name;
			System.out.println(s);*/
		}
	}
}
