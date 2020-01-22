package project;
import java.sql.*;
public class connection
{
Connection c;
Statement s;
public connection()
{
try
{
Class.forName("com.mysql.jdbc.Driver");
c=DriverManager.getConnection("jdbc:mysql:///elect","root","");
s=c.createStatement();
}
catch(Exception e)
{
System.out.println("Error");
}
}
public static void main(String args[])
{
connection c1=new connection();
}
}
