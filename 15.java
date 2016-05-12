import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,i=0,n=0;
String s="\0";
m=Integer.parseInt(b.readLine());
if(m%7==0||m%7==4||m%7==5||m%7==6)
{
for(i=0;i<(m/7);i++)
s+="ROYGBIV";
if(m%7==4)
s+="ROYG";
if(m%7==5)
s+="ROYGB";
if(m%7==6)
s+="ROYGBI";
}
else
{
if(m%7==1)
{
s+="ROYGRBIV";
n=m/7-1;
}
if(m%7==2)
{
s+="ROYGROBIV";
n=m/7-1;
}
if(m%7==3)
{
s+="ROYGROYBIV";
n=m/7-1;
}
for(i=0;i<n;i++)
s+="ROYGBIV";
}
System.out.print(s.trim());
}
}