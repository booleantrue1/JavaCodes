import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,j=0,n=0,f=0,i=0;
n=Integer.parseInt(b.readLine());
String s;
double d=0,m=0;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
{
m=Double.parseDouble(c.nextToken());
d=Math.sqrt(m);
if(m==1||m==2||m==3)
System.out.println("NO");
else
{
if(d==(int)d)
{
p=(int)d;
for(j=2;j<=Math.sqrt(p);j++)
{
if(p%j==0)
{
f=1;
break;
}
}
if(f==0)
System.out.println("YES");
else
System.out.println("NO");
}
else
System.out.println("NO");
f=0;
}
}
}
}