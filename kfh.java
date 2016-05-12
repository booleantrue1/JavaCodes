import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int total=0,half1=0,half3=0,n=0,j=0,half=0;
String s;
n=Integer.parseInt(b.readLine());
for(j=0;j<n;j++)
{
s=b.readLine();
if(s.compareTo("1/4")==0)
half1++;
if(s.compareTo("1/2")==0)
half++;
if(s.compareTo("3/4")==0)
half3++;
}
total+=half3;
if(half1<=half3)
half1=0;
else
{
half1=half1-half3;
}
total+=half/2;
half=half%2;
total+=half1/4;
half1=half1%4;
if(half==0)
{
if(half1!=0)
total++;
}
else
{
if(half1==3)
total+=2;
else
total++;
}
System.out.print(++total);
}
}