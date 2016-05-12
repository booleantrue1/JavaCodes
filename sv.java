import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
double f=0,m=0,n=0,k=0,t=0,l=0,p=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Double.parseDouble(c.nextToken());
n=Double.parseDouble(c.nextToken());
p=Double.parseDouble(c.nextToken());
k=Double.parseDouble(c.nextToken());
t=Double.parseDouble(c.nextToken());
l=Double.parseDouble(c.nextToken());
if(p==0&&k>0)
System.out.print("Ron");
else
{
f=n*k/p;
f=f*l/t;
if(f>m)
System.out.print("Ron");
else
System.out.print("Hermione");
}
}
}