import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,n=0,m=0,q=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
p=Integer.parseInt(z.nextToken());
q=Integer.parseInt(z.nextToken());
if(m==q)
{
System.out.print("YES");
System.exit(0);
}
else
{
if(m>q&&m-q==1)
{
System.out.print("YES");
System.exit(0);
}
else
{
if(q>m&&(q<=3*m||((m==1)&&(q==1||q==2||q==3||q==4))))
{
System.out.print("YES");
System.exit(0);
}
else
{
if(n==p)
{
System.out.print("YES");
System.exit(0);
}
else
{
if(n>p&&n-p==1)
{
System.out.print("YES");
System.exit(0);
}
else
{
if(p>n&&(p<=3*n||((n==1)&&(p==1||p==2||p==3||p==4))))
{
System.out.print("YES");
System.exit(0);
}
else
{
System.out.print("NO");
System.exit(0);
}
}
}
}
}
}
}
}