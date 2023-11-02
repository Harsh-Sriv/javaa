 import java.sql.*;
 public class Sample_JDBC_Program {
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
 // store the SQL statement in a string
 String QUERY = "select * from employee_details";
 //register the oracle driver with DriverManager
 Class.forName("oracle.jdbc.driver.OracleDriver"); 
 try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:system/pass123@localhost:1521:XE"))
 {
 Statement statemnt1 = conn.createStatement();
 //Created statement and execute it 
ResultSet rs1 = statemnt1.executeQuery(QUERY); 
{
     while(rs1.next())
 {
 int empNum = rs1.getInt("empNum");
 String lastName = rs1.getString("lastName");
 String firstName = rs1.getString("firstName");
 String email = rs1.getString("email");
 String deptNum = rs1.getString("deptNum");
 String salary = rs1.getString("salary");
  System.out.println(empNum + "," +lastName+ "," +firstName+ "," 
+email +","+deptNum +"," +salary);
 }
 } 
}
 catch (SQLException e) {
 //If exception occurs catch it and exit the program
 e.printStackTrace();
 }
 }
 }