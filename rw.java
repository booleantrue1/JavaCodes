import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,k=0,l=0,m=0,n=0;
String s[];
String p[];
String q[];
String r[];
String t[];
String u[];
String w[];
String x[];
String y[];
String v="\0",z="\0";
n=Integer.parseInt(b.readLine());
s=new String[n];
p=new String[n];
q=new String[n];
r=new String[n];
t=new String[n];
u=new String[n];
w=new String[n];
x=new String[n];
y=new String[n];
for(i=0;i<n;i++)
{
s[i]=b.readLine();
StringTokenizer c=new StringTokenizer(s[i]);
v=c.nextToken();
z=c.nextToken();
if(z.compareTo("rat")==0)
{
p[j]=v;
q[j]=z;
j++;
}
if(z.compareTo("woman")==0||z.compareTo("child")==0)
{
r[k]=v;
t[k]=z;
k++;
}
if(z.compareTo("man")==0)
{
u[l]=v;
w[l]=z;
l++;
}
if(z.compareTo("captain")==0)
{
x[m]=v;
y[m]=z;
m++;
}
}
for(i=0;i<j;i++)
System.out.println(p[i]);
for(i=0;i<k;i++)
System.out.println(r[i]);
for(i=0;i<l;i++)
System.out.println(u[i]);
for(i=0;i<m;i++)
System.out.println(x[i]);
}
}