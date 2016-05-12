import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
int a=0,b=0,x=0,j=0,k=0,p=0,r=0,y=0,i=0;
String s;
s=obj.readLine();
StringTokenizer c=new StringTokenizer(s);
x=Integer.parseInt(c.nextToken());
y=Integer.parseInt(c.nextToken());
a=Integer.parseInt(c.nextToken());
b=Integer.parseInt(c.nextToken());
p=a;
if(a>=b)
{
for(j=b;j<=y;j++)
{
if(j==p)
p++;
for(i=p;i<=x;i++)
k++;
}
System.out.println(k);
for(i=a;i<=x;i++)
{
if(b==i)
i++;
if(i<=x)
for(j=b;j<=y&&j<i;j++)
System.out.println(i+" "+j);
}
}
else
{
for(j=b;j<=y;j++)
{
for(i=(j+1);i<=x;i++)
r++;
}
System.out.println(r);
for(i=(b+1);i<=x;i++)
{
for(j=b;j<=y&&j<i;j++)
{
System.out.println(i+" "+j);
}
}
}
}
}