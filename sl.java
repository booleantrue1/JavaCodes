import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,n=0,m=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
String r[]=new String[n];
r[0]=b.readLine();
for(i=1;i<n;i++)
r[i]=b.readLine();
for(j=0;j<m;j++)
{
if(r[0].charAt(j)==r[0].charAt(0))
continue;
else
{
System.out.print("NO");
System.exit(0);
}
}
for(i=1;i<n;i++)
{
if(r[i].charAt(0)!=r[i-1].charAt(0))
{
for(j=0;j<m;j++)
{
if(r[i].charAt(j)==r[i].charAt(0))
continue;
else
{
System.out.print("NO");
System.exit(0);
}
}
}
else
{
System.out.print("NO");
System.exit(0);
}
}
System.out.print("YES");
}
}










