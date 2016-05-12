import java.io.*;
import java.util.*;
import java.text.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0;
double p=0,x1=0,x2=0,x3=0;
DecimalFormat f=new DecimalFormat(".000000");
n=Integer.parseInt(b.readLine());
String s;
int d[]=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
if(n==1)
{
p=0;
x1=d[0];
x2=d[0];
x3=d[0];
}
if(n==2)
{
p=0;
x1=d[0];
x2=d[0];
x3=d[1];
}
if(n==3)
{
p=0;
x1=d[0];
x2=d[1];
x3=d[2];
}
if(n>3)
{
Arrays.sort(d);
p=((double)(d[n-1]-d[0]))/6;
x1=d[0]+p;
x2=d[0]+3*p;
x3=d[0]+5*p;
}
System.out.println(f.format(p));
System.out.println(f.format(x1)+" "+f.format(x2)+" "+f.format(x3));
}
}