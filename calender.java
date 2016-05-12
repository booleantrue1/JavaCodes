import java.io.*;
import java.util.*;
import java.text.*;
class j 
{
public static void main(String[] aa)throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int test=Integer.parseInt(b.readLine());
int i;
for(i=0;i<test;i++)
{
String d1="2012:01:11";
String s=b.readLine();
String days,month,year;
StringTokenizer c=new StringTokenizer(s);
int day=Integer.parseInt(c.nextToken());
int mon=Integer.parseInt(c.nextToken());
int yr=Integer.parseInt(c.nextToken());
if(day/10==0)
days="0"+String.valueOf(day);
else
days=String.valueOf(day);
if(mon/10==0)
month="0"+String.valueOf(mon);
else
month=String.valueOf(mon);
year=String.valueOf(yr);
String d2=year+":"+month+":"+days;
SimpleDateFormat format=new SimpleDateFormat("yyyy:MM:dd");
format.setTimeZone(TimeZone.getTimeZone("UTC"));
Date date1=null;
Date date2=null;
try 
{
date1=format.parse(d2);
date2=format.parse(d1);
}
catch(Exception e)
{
e.printStackTrace();
}
long difference=date1.getTime()-date2.getTime();       
long dayst=difference/(24*60*60*1000);
dayst=(dayst<0)?(-1)*dayst:dayst;
if(dayst%7==0)
System.out.println("Wednesday");
if(dayst%7==1)
System.out.println("Thursday");
if(dayst%7==2)
System.out.println("Friday");
if(dayst%7==3)
System.out.println("Saturday");
if(dayst%7==4)
System.out.println("Sunday");
if(dayst%7==5)
System.out.println("Monday");
if(dayst%7==6)
System.out.println("Tuesday");
}
System.out.close();
}
}