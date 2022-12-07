import  java.sql.*;
import java.text.SimpleDateFormat;
import  java.util.*;
class Employee1
{
    int	employeeId;
    String name;
    String dateOfBirth;
    int salary;
    Employee1(int employeeId,String name,String dateOfBirth,int salary)
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
class EmployeeDAO1
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
    public void addEmployee(Employee1 ep1) throws ClassNotFoundException, SQLException {
        // PreparedStatement ps = null;
        String query = "insert into employee(employee_id,name,date_of_birth,salary) values (?,?,?,?)";
        PreparedStatement ps = EmployeeDAO1.getConnection().prepareStatement(query);
        ps.setInt(1,ep1.getEmployeeId());
        ps.setString(2,ep1.getName());
        ps.setString(3,ep1.getDateOfBirth());
        ps.setInt(4,ep1.getSalary());
        int i = ps.executeUpdate();
        System.out.println(i+"Employee added Successfull !!");
    }
    public ArrayList<Employee1> getAllEmployee() throws ClassNotFoundException, SQLException {
        ArrayList<Employee1> a = new ArrayList<Employee1>();
            String sql = "select * from Employee";
            //PreparedStatement ps = EmployeeDAO1.getConnection().prepareStatement(sql);
            Statement ps = EmployeeDAO1.getConnection().createStatement();
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()){
             int id = rs.getInt(1);
             String name = rs.getString(2);
             String pattern = "dd/MM/yyyy";
             SimpleDateFormat sdf = new SimpleDateFormat(pattern);
             String date = sdf.format(rs.getDate(3));
             int sal = rs.getInt(4);
             Employee1 ep1 = new Employee1(id,name,date,sal);
             a.add(ep1);
            }
        return a;
    }
}
class EmployeeService1
{
    public void addEmployee(Employee1 ep1) throws ClassNotFoundException, SQLException {
        EmployeeDAO1 edao = new EmployeeDAO1();
        edao.addEmployee(ep1);
    }
    public ArrayList<Employee1> getAllEmployee() throws SQLException, ClassNotFoundException {
        EmployeeDAO1 edao = new EmployeeDAO1();
        return edao.getAllEmployee();
    }
}

public class Display_Employee_JDBC {
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
        Employee1 ep1 = new Employee1(employeeId,name,dateOfBirth,salary);
        EmployeeService1 es = new EmployeeService1();
        es.addEmployee(ep1);
        ArrayList<Employee1> emp = es.getAllEmployee();

    }
}
