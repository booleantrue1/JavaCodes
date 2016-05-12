import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int q=0,v=0,p=0,i=0,n=0,t=0;
double k=0;
String s;
t=Integer.parseInt(b.readLine());
int d[]=new int[t];
int e[]=new int[t];
for(i=0;i<t;i++)
{
d[i]=Integer.parseInt(b.readLine());
k+=d[i];
}
k=k/t;
for(i=0;i<t;i++)
if(d[i]!=k)
{
e[n]=i;
n++;
p=d[i]-p;
}
if(n==0)
{
System.out.print("Exemplary pages.");
System.exit(0);
}
if(n==2)
{
p=(int)(Math.abs(p)/2);
q=(d[e[0]]>d[e[1]])?e[0]:e[1];
v=(d[e[0]]<d[e[1]])?e[0]:e[1];
System.out.print(p+" ml. from cup #"+(v+1)+" to cup #"+(q+1)+".");
System.exit(0);
}
else
{
System.out.print("Unrecoverable configuration.");
System.exit(0);
}
}
}