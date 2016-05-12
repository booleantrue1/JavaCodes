import java.sql.*;
import sun.jdbc.odbc.*;
class acccon
{
public static void main(String aa[])
{

try
{
new JdbcOdbcDriver();
Connection conn=DriverManager.getConnection("jdbc:odbc:Database1");
System.out.println("Connection successful");
Statement s=conn.createStatement();
//s.executeUpdate("update tabfav set grade='FAIL' where per<40");
//s.executeUpdate("update tabfav set grade='PASS' where per>=40");
ResultSet r=s.executeQuery("select * from register");
while(r.next())
{
System.out.print(r.getInt(1));
System.out.print(" "+r.getString(2));
System.out.println(" "+r.getString(3));
//System.out.println(" "+r.getString(4));
}
System.out.println("Table printed");
conn.close();
}
catch(Exception e)
{
System.out.print(e.getMessage());
}
}
}