import  java.sql.*;
import  java.util.*;
class Employee
{
    int	employeeId;
	String name;
    String dateOfBirth;
	int salary;
	Employee(int employeeId,String name,String dateOfBirth,int salary)
    {
        setEmployeeId(employeeId);
        setName(name);
        setDateOfBirth(dateOfBirth);
        setSalary(salary);
    }
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }
}
class EmployeeDAO
{
    public static Connection getConnection() throws ClassNotFoundException {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded....");
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/payroll","devuser","Rohit@6290845271");
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
       return con;
    }
    public void addEmployee(Employee ep) throws ClassNotFoundException, SQLException {
       // PreparedStatement ps = null;
        String query = "insert into employee(employee_id,name,date_of_birth,salary) values (?,?,?,?)";
        PreparedStatement ps = EmployeeDAO.getConnection().prepareStatement(query);
        ps.setInt(1,ep.getEmployeeId());
        ps.setString(2,ep.getName());
        ps.setString(3,ep.getDateOfBirth());
        ps.setInt(4,ep.getSalary());
        int i = ps.executeUpdate();
        System.out.println(i+"Employee added Successfull !!");
    }
}
class EmployeeService
{
    public void addEmployee(Employee ep) throws ClassNotFoundException, SQLException {
        EmployeeDAO edao = new EmployeeDAO();
        edao.addEmployee(ep);
    }
}
public class Insert_Employee_JDBC
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee details");
        System.out.println("Enter the ID:");
        int employeeId= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Name:");
        String name= sc.nextLine();
        System.out.println("Enter the Date of birth (dd/MM/yyyy):");
        String dateOfBirth = sc.nextLine();
        System.out.println("Enter the Salary:");
        int salary = sc.nextInt();
        Employee ep = new Employee(employeeId,name,dateOfBirth,salary);
        EmployeeService es = new EmployeeService();
        es.addEmployee(ep);
    }
}
