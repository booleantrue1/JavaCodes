import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,P1=0,P2=0,P3=0,T1=0,T2=0,p=0,n=0,f=0,l=0,r=0,t1=0,t2=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
P1=Integer.parseInt(c.nextToken());
P2=Integer.parseInt(c.nextToken());
P3=Integer.parseInt(c.nextToken());
T1=Integer.parseInt(c.nextToken());
T2=Integer.parseInt(c.nextToken());
String d[]=new String[1500];
for(i=0;i<1500;i++)
d[i]="a";
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
l=Integer.parseInt(z.nextToken());
if(i==0)
t1=l;
r=Integer.parseInt(z.nextToken());
if(i!=n-1)
for(j=l;j<r+T1;j++)
d[j]="ON";
else
{
t2=r;
for(j=l;j<r;j++)
d[j]="ON";
}
}
for(i=t1;i<t2;i++)
{
if(d[i].compareTo("ON")==0)
{
f=0;
continue;
}
if(f==T2)
{
d[i]="SLEEP";
continue;
}
d[i]="SS";
f++;
}
for(i=t1;i<t2;i++)
{
if(d[i].compareTo("ON")==0)
p+=P1;
if(d[i].compareTo("SS")==0)
p+=P2;
if(d[i].compareTo("SLEEP")==0)
p+=P3;
}
System.out.print(p);
}
}