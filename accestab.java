import java.sql.*;
import java.util.*;
import java.io.*;
import sun.jdbc.odbc.*;
class acccon
{
public static void main(String aa[])
{
try
{
new JdbcOdbcDriver();
Connection conn=DriverManager.getConnection("jdbc:odbc:checkdata");
System.out.println("Connection successful");
Statement s=conn.createStatement();
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String attributes[]={"ID","Full Name","Mobile Number","Health Card Number","Blood Pressure High","Blood Pressure Low","Heart Rate","Sugar Level","Cholestrol","Doc Id Previously Consulted","Appointment Number","Premium Member","Time Of Appointment"};
int query[]=new int[20];
String quer_name="";
for(int i=1;i<14;i++)
{
System.out.println("Enter "+attributes[i-1]);
if(i==2)
quer_name=b.readLine();
else
query[i]=Integer.parseInt(b.readLine());
}
int k=Integer.parseInt(b.readLine());
//s.executeUpdate("update tabfav set grade='FAIL' where per<40");
//s.executeUpdate("update tabfav set grade='PASS' where per>=40");
ResultSet r=s.executeQuery("select * from register");
int temp;
String t="";
String tem_str="",ans_quer="";
int arr[]=new int[22];
int i=0,cnt=0;
while(r.next())
{
arr[i]=0;
int j;
for(j=1;j<14;j++)
{
if(j==2)
{
tem_str=r.getString(j);
continue;
}
t=r.getString(j);
temp=Integer.parseInt(t);
arr[i]+=(temp-query[j])*(temp-query[j]);
}
i++;
}
int j;
Arrays.sort(arr);
int search=arr[k-1];
conn.close();
Connection con=DriverManager.getConnection("jdbc:odbc:checkdata");
Statement s1=con.createStatement();
ResultSet u=s1.executeQuery("select * from register");
int check;
int ans[]=new int[20];
while(u.next())
{
check=0;
for(j=1;j<14;j++)
{
if(j==2)
{
ans_quer=u.getString(j);
continue;
}
t=u.getString(j);
temp=Integer.parseInt(t);
ans[j]=temp;
check+=(temp-query[j])*(temp-query[j]);
}
if(check==search)
{
for(j=1;j<14;j++)
{
if(j==2)
System.out.print(ans_quer+"\t");
else
System.out.print(ans[j]+"\t");
}
break;
}
}
System.out.print("\nQuery Completed.");
con.close();
}
catch(Exception e)
{
System.out.print("Records over");
}
}







}
