import java.sql.*;
import java.util.*;
import java.io.*;
import sun.jdbc.odbc.*;
class acccon
{
static int query[]=new int[20];
static int ans[][]=new int[4000][20];
static int k=0,final_key=0;
static String tem_str="";
static String ans_quer[]=new String[4000];
static int arr[]=new int[4000];
static long totalTime=0;





public static void main(String aa[])
{
try
{
new JdbcOdbcDriver();
Connection conn=DriverManager.getConnection("jdbc:odbc:checkdata");
System.out.println("Connection successful");
Statement s=conn.createStatement();
int key=server1();
int j,temp;
String t="";
long srt=System.currentTimeMillis();
Arrays.sort(arr);
long ert=System.currentTimeMillis();
long trt=ert-srt;
totalTime+=trt;
int tt=0;
conn.close();
int xx=0;
long ssrt=System.currentTimeMillis();
for(xx=0;xx<k;xx++)
{
int search=arr[xx];
Connection con=DriverManager.getConnection("jdbc:odbc:checkdata");
Statement s1=con.createStatement();
ResultSet u=s1.executeQuery("select * from register");
int check;
while(u.next())
{
check=0;
for(j=1;j<14;j++)
{
if(j==2)
{
ans_quer[xx]=u.getString(j);
continue;
}
t=u.getString(j);
temp=Integer.parseInt(t);
ans[xx][j]=temp;
check+=(temp-query[j])*(temp-query[j]);
}
if(check==search)
break;
}
con.close();
}
final_key=server2();
for(tt=0;tt<k;tt++)
{
int yp=0;
for(yp=1;yp<14;yp++)
{
if(yp==2)
System.out.print(ans_quer[tt]+"\t");
else
System.out.print(ans[tt][yp]+"\t");
}
System.out.println("\n*******************************************************************************");
}
long eert=System.currentTimeMillis();
long ttrt=eert-ssrt;
totalTime+=ttrt;
System.out.println("\nDo You Want To Decrypt The Output (0/1) ?");
BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
int choice=Integer.parseInt(z.readLine());
if(choice==1)
{
int yy=0;
for(yy=0;yy<k;yy++)
{
for(j=1;j<14;j++)
{
if(j==2)
System.out.print(ans_quer[yy]+"\t");
else
System.out.print(ans[yy][j]-final_key-key+"\t");
}
System.out.println("\n*******************************************************************************");
}
}
System.out.print("\nQuery Completed.");
decryptDatabase(key);
System.out.println("\nTotal Running Time = "+(totalTime/1000)+" s");
}
catch(Exception e)
{
System.out.print("Records over");
}
}





static int server1()throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String attributes[]={"ID","Full Name","Mobile Number","Health Card Number","Blood Pressure High","Blood Pressure Low","Heart Rate","Sugar Level","Cholestrol","Doc Id Previously Consulted","Appointment Number","Premium Member","Time Of Appointment"};
String quer_name="";
System.out.println("Enter a security key (absolute value < 4 digits) to encrypt the query");
int security_key=Integer.parseInt(b.readLine());
encryptDatabase(security_key);
for(int i=1;i<14;i++)
{
System.out.println("Enter "+attributes[i-1]);
if(i==2)
quer_name=b.readLine();
else
query[i]=Integer.parseInt(b.readLine())+security_key;
}
k=Integer.parseInt(b.readLine());
evalfirst(security_key);
evalsecond(security_key);
/*int yr=0;
for(yr=0;yr<2000;yr++)
System.out.print(arr[yr]+"\t");
System.out.println();*/
return security_key;
}





static int server2()throws IOException
{
Random rnd = new Random();
int second_key=rnd.nextInt(999);
int xx=0;
for(xx=0;xx<k;xx++)
{
for(int i=1;i<14;i++)
{
if(i!=2)
ans[xx][i]+=second_key;
}
}
return second_key;
}





static void evalfirst(int x)throws IOException
{
try
{
long srt=System.currentTimeMillis();
new JdbcOdbcDriver();
Connection conn=DriverManager.getConnection("jdbc:odbc:checkdata");
//System.out.println("Connection successful");
Statement s=conn.createStatement();
String qu="select * from register Where ID<";
String ad1=String.valueOf(2000+x);
ResultSet r=s.executeQuery(qu+ad1+1);
int temp;
String t="";
int i=0;
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
long ert=System.currentTimeMillis();
long trt=ert-srt;
totalTime+=trt;
}
catch(Exception e)
{
//System.out.print("Records over");
}
}





static void evalsecond(int x)throws IOException
{
try
{
long srt=System.currentTimeMillis();
new JdbcOdbcDriver();
Connection conn=DriverManager.getConnection("jdbc:odbc:checkdata");
//System.out.println("Connection successful");
Statement s=conn.createStatement();
String qu1="select * from register Where ID>";
String ad1=String.valueOf(2000+x);
String qu2="AND ID<";
String ad2=String.valueOf(4001+x);
ResultSet r=s.executeQuery(qu1+ad1+qu2+ad2);
int temp;
String t="";
int i=2000;
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
long ert=System.currentTimeMillis();
long trt=ert-srt;
totalTime+=trt;
}
catch(Exception e)
{
//System.out.print("Records over");
}
}





static void encryptDatabase(int x)throws IOException
{
long srt=System.currentTimeMillis();
try
{
new JdbcOdbcDriver();
Connection conn=DriverManager.getConnection("jdbc:odbc:checkdata");
Statement s=conn.createStatement();
String keyval=String.valueOf(x);
String strval="";
strval="update register set ID=ID+";
s.executeUpdate(strval+keyval);
strval="update register set Cholestrol=Cholestrol+";
s.executeUpdate(strval+keyval);
strval="update register set MobileNumber=MobileNumber+";
s.executeUpdate(strval+keyval);
strval="update register set HealthCardNumber=HealthCardNumber+";
s.executeUpdate(strval+keyval);
strval="update register set BloodPressureHigh=BloodPressureHigh+";
s.executeUpdate(strval+keyval);
strval="update register set BloodPressureLow=BloodPressureLow+";
s.executeUpdate(strval+keyval);
strval="update register set HeartRate=HeartRate+";
s.executeUpdate(strval+keyval);
strval="update register set SugarLevel=SugarLevel+";
s.executeUpdate(strval+keyval);
strval="update register set DocIdPreviouslyConsulted=DocIdPreviouslyConsulted+";
s.executeUpdate(strval+keyval);
strval="update register set AppointmentNumber=AppointmentNumber+";
s.executeUpdate(strval+keyval);
strval="update register set PremiumMember=PremiumMember+";
s.executeUpdate(strval+keyval);
strval="update register set TimeOfAppointment=TimeOfAppointment+";
s.executeUpdate(strval+keyval);
conn.close();
long ert=System.currentTimeMillis();
long trt=ert-srt;
totalTime+=trt;
}
catch(Exception e)
{
//System.out.print("Records Over");
}
}





static void decryptDatabase(int x)throws IOException
{
try
{
long srt=System.currentTimeMillis();
new JdbcOdbcDriver();
Connection conn=DriverManager.getConnection("jdbc:odbc:checkdata");
Statement s=conn.createStatement();
String keyval=String.valueOf(x);
String strval="update register set ID=ID-";
s.executeUpdate(strval+keyval);
strval="update register set Cholestrol=Cholestrol-";
s.executeUpdate(strval+keyval);
strval="update register set MobileNumber=MobileNumber-";
s.executeUpdate(strval+keyval);
strval="update register set HealthCardNumber=HealthCardNumber-";
s.executeUpdate(strval+keyval);
strval="update register set BloodPressureHigh=BloodPressureHigh-";
s.executeUpdate(strval+keyval);
strval="update register set BloodPressureLow=BloodPressureLow-";
s.executeUpdate(strval+keyval);
strval="update register set HeartRate=HeartRate-";
s.executeUpdate(strval+keyval);
strval="update register set SugarLevel=SugarLevel-";
s.executeUpdate(strval+keyval);
strval="update register set DocIdPreviouslyConsulted=DocIdPreviouslyConsulted-";
s.executeUpdate(strval+keyval);
strval="update register set AppointmentNumber=AppointmentNumber-";
s.executeUpdate(strval+keyval);
strval="update register set PremiumMember=PremiumMember-";
s.executeUpdate(strval+keyval);
strval="update register set TimeOfAppointment=TimeOfAppointment-";
s.executeUpdate(strval+keyval);
conn.close();
long ert=System.currentTimeMillis();
long trt=ert-srt;
totalTime+=trt;
}
catch(Exception e)
{
//System.out.print("Records over");
}
}





}