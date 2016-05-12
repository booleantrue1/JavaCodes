import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int z=0,g=0,j=0,m=0,n=0,f=0,h=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
if(n==4)
System.out.print("NO");
else
{
for(i=2;i<n/2&&n!=4;i++)
if(n%i==0)
{
f=1;
break;
}
if(f==1)
System.out.print("NO");
else
{
for(i=m+1;i<n;i++)
{
if(i==4)
{
h=1;
continue;
}
h=0;
for(j=2;j<i/2;j++)
{
if(i%j==0)
{
g=1;
break;
}
}
if(g==0)
{
z=1;
System.out.print("NO");
break;
}
g=0;
}
if(g==0&&z==0&&i!=5)
System.out.print("YES");
if(h==1)
System.out.print("YES");
}
}
}
}