 import java.sql.*;
public class javamysql{
    public static void main(String arg[])
    {
        Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","mydbuser", "mydbuser");
 Statement statement;
 statement = connection.createStatement();
 ResultSet resultSet;
 resultSet = statement.executeQuery("select * from designation");
 int code;
 String title;
 while (resultSet.next()) {
    code = resultSet.getInt("code");   
    title = resultSet.getString("title").trim();
    System.out.println("Code: "+code + ", Title: " + title);
        }
        resultSet.close();
        statement.close();
        connection.close();
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}