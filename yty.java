import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,x=0,y=0;
double t=0,u=0;
char q='\0';
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
x=Integer.parseInt(c.nextToken());
y=Integer.parseInt(c.nextToken());
s=b.readLine();
n=s.length();
int d[]=new int[n+1];
int e[]=new int[n+1];
d[0]=0;
e[0]=0;
for(i=0;i<n;i++)
{
q=s.charAt(i);
if(q=='L')
{
d[i+1]=d[i]-1;
e[i+1]=e[i];
}
if(q=='R')
{
d[i+1]=d[i]+1;
e[i+1]=e[i];
}if(q=='U')
{
d[i+1]=d[i];
e[i+1]=e[i]+1;
}if(q=='D')
{
d[i+1]=d[i];
e[i+1]=e[i]-1;
}
}
if(d[n]==0&&e[n]==0)
{
for(i=0;i<=n;i++)
{
if(d[i]==x&&e[i]==y)
{
System.out.print("Yes");
System.exit(0);
}
}
System.out.print("No");
}
if(d[n]==0&&e[n]!=0)
{
for(i=0;i<=n;i++)
{
if(d[i]==x)
{
t=(double)(y-e[i])/e[n]+1;
if(t==(int)t&&t>0)
{
System.out.print("Yes");
System.exit(0);
}
}
}
System.out.print("No");
}
if(e[n]==0&&d[n]!=0)
{
for(i=0;i<=n;i++)
{
if(e[i]==y)
{
t=(double)(x-d[i])/d[n]+1;
if(t==(int)t&&t>0)
{
System.out.print("Yes");
System.exit(0);
}
}
}
System.out.print("No");
}
if(d[n]!=0&&e[n]!=0)
{
for(i=0;i<=n;i++)
{
u=(double)(x-d[i])/d[n]+1;
t=(double)(y-e[i])/e[n]+1;
if(t==(int)t&&t>0&&u==(int)u&&u>0&&t==u)
{
System.out.print("Yes");
System.exit(0);
}
}
System.out.print("No");
}
}
}