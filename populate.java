import java.sql.*;
import java.util.*;
import java.io.*;
import sun.jdbc.odbc.*;
class upd
{
public static void main(String aa[])
{
try
{
new JdbcOdbcDriver();
Connection conn=DriverManager.getConnection("jdbc:odbc:checkdata");
System.out.println("Connection successful");
Statement s=conn.createStatement();
Random gen=new Random();
int i=0;
int id=0;
for(i=0;i<4000;i++)
{
id++;
int t1=97+gen.nextInt(20),t2=97+gen.nextInt(20),t3=97+gen.nextInt(20);
String name=String.valueOf((char)t1)+(char)(t2)+(char)(t3);
int a1=gen.nextInt(500);
int a2=gen.nextInt(500);
int a3=gen.nextInt(500);
int a4=gen.nextInt(500);
int a5=gen.nextInt(500);
int a6=gen.nextInt(500);
int a7=gen.nextInt(500);
int a8=gen.nextInt(500);
int a9=gen.nextInt(500);
int a10=gen.nextInt(500);
int a11=gen.nextInt(500);
s.executeUpdate("insert into register values('"+id+"','"+name+"','"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"','"+a9+"','"+a10+"','"+a11+"')");
}
System.out.print("\nQuery Completed.");
conn.close();
}
catch(Exception e)
{
System.out.print("Records over");
}
}
}