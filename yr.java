import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,k=0,n=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
for(i=0;i<10005;i++)
{
if(Math.pow(n+1,m)>=k&&Math.pow(n,m+1)>=k)
break;
else
{
if(Math.pow(n+1,m)>=k)
m++;
else
{
if(Math.pow(n,m+1)>=k)
n++;
else
{
if(Math.pow(n+1,m)>Math.pow(n,m+1))
m++;
else
n++;
}
}
}
}
if(i==10005)
System.out.print("Missing");
else
{
if(i%2==0)
System.out.print("Stas");
else
System.out.print("Masha");
}
}
}