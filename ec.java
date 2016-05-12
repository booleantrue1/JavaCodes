import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int q=0,y=-10000000,x=-1001,k=0,f=0,j=0,n=0,p=0,i=0;
String s,v="\0",r,t="\0";
n=Integer.parseInt(b.readLine());
String d[]=new String[n];
d[0]="\0";
int e[]=new int[n];
e[0]=0;
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
r=c.nextToken();
p=Integer.parseInt(c.nextToken());
for(j=0;j<k;j++)
{
if(d[j].compareTo(r)==0)
{
e[j]+=p;
if(e[j]==x)
t+=(" "+d[j]);
if(e[j]>x)
{
t=d[j];
x=e[j];
}
f=1;
break;
}
}
if(f==0)
{
d[k]=r;
e[k]+=p;
if(e[k]==x)
t+=(" "+d[j]);
if(e[k]>x)
{
t=d[k];
x=e[k];
}
k++;
}
f=0;
}
for(i=0;i<k;i++)
if(e[i]>y)
y=e[i];
StringTokenizer z=new StringTokenizer(t);
q=z.countTokens();
for(i=0;i<q;i++)
{
v=z.nextToken();
for(j=0;j<k;j++)
{
if(d[j].compareTo(v)==0)
{
if(e[j]==y)
{
System.out.print(d[j]);
System.exit(0);
}
else
break;
}
}
}
}
}