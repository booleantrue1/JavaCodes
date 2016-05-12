import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,l=0,k=0,f=0,m=0,i=0;
long n=0,p=0;
m=Integer.parseInt(b.readLine());
String s,r1,r2;
String d[]=new String[m];
String e[]=new String[m*m];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<m;i++)
d[i]=c.nextToken();
for(i=0;i<m;i++)
{
for(j=0;j<m;j++)
{
if(j==i)
continue;
r1=d[i]+d[j];
r2=d[j]+d[i];
n=Long.parseLong(r1);
p=Long.parseLong(r2);
if(n%3==0)
{
for(k=0;k<l;k++)
if(e[k].compareTo(r1)==0)
{
f=1;
break;
}
if(f==0)
{
e[l]=r1;
l++;
}
f=0;
}
if(p%3==0)
{
for(k=0;k<l;k++)
if(e[k].compareTo(r2)==0)
{
f=1;
break;
}
if(f==0)
{
e[l]=r1;
l++;
}
f=0;
}
}
}
for(i=0;i<l;i++)
System.out.println(e[i]);
System.out.print(l);
}
}