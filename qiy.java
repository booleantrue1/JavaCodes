import java.io.*;
import java.util.*;
import java.text.*;
class j 
{
public static void main(String[] aa)
{
Scanner in=new Scanner(new InputStreamReader(System.in));
PrintWriter out=new PrintWriter(System.out);
String d1="2012:01:11";
String s=in.nextLine();
String Tokenizer c=new StringTokenizer(s);
int day=Integer.parseInt(c.nextToken());
int mon=Integer.parseInt(c.nextToken());
int yr=Integer.parseInt(c.nextToken());
if(day/10==0)
String days="0"+String.valueOf(day);
else
String days=String.valueOf(day);
if(mon/10==0)
String month="0"+String.valueOf(mon);
else
String month=String.valueOf(mon);
String year=String.valueOf(yr);
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
long days=difference/(24*60*60*1000);
out.println(Math.abs(days));       
in.close();
out.close();
}
}