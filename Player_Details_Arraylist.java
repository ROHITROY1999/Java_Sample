import java.util.*;

class Player27
{
    private String name, country, skill;
    public void setName(String newName)
    {
        this.name = newName;
    }
    public void setCountry(String newCountry)
    {
        this.country = newCountry;
    }
    public void setSkill(String newSkill)
    {
        this.skill = newSkill;
    }
    public Player27(String name, String country, String skill)
    {
        this.setName(name);
        this.setCountry(country);
        this.setSkill(skill);
    }
    public String getName()
    {
        return this.name;
    }
    public String getCountry()
    {
        return this.country;
    }
    public String getSkill()
    {
        return this.skill;
    }
    public String toString()
    {
        return String.format("%-15s %-15s %-15s", this.getName(), this.getCountry(), this.getSkill());
    }
}

public class Player_Details_Arraylist
{
    void displayAllPlayerDetails(ArrayList<Object> playerArr)
    {
        for(Object a:playerArr)
        {
            System.out.println(a.toString());
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int total = sc.nextInt();
        sc.nextLine();
        ArrayList<Object> arr = new ArrayList<>(total);
        for(int i = 0; i < total; i++)
        {
            System.out.println("Enter the player name");
            String str1 = sc.nextLine();
            System.out.println("Enter the country name");
            String str2 = sc.nextLine();
            System.out.println("Enter the skill");
            String str3 = sc.nextLine();
            Player27 P = new Player27(str1, str2, str3);
            arr.add(P);
        }
        Player_Details_Arraylist pbo = new Player_Details_Arraylist();
        pbo.displayAllPlayerDetails(arr);
    }
}