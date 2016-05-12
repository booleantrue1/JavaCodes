import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,k=0,i=0,t=0,y=0,x=0;
double p=0,minm2=0,dis=0,tim1=0,tim2=0;
String s;
t=Integer.parseInt(b.readLine());
for(i=0;i<t;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
x=Integer.parseInt(c.nextToken());
y=Integer.parseInt(c.nextToken());
j=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
dis=Math.sqrt(x*x+y*y);
if(k>j)
System.out.println(dis);
else
{
p=dis%j;
if(p<=j-p)
System.out.println(dis/j*k+p);
else
{
tim1=p;
tim2=k+j-p;
minm2=(tim1<tim2)?tim1:tim2;
System.out.println(minm2+dis/j*k);
}
}
}
}
}