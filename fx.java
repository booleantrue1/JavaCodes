import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,n=0,p=0,t=0;
int d[];
int e[];
String s;
t=Integer.parseInt(b.readLine());
for(i=0;i<t;i++)
{
n=Integer.parseInt(b.readLine());
d=new int[n];
e=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(j=0;j<n;j++)
d[j]=Integer.parseInt(c.nextToken());
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(j=0;j<n;j++)
e[j]=Integer.parseInt(z.nextToken());
Arrays.sort(d);
Arrays.sort(e);
for(j=0;j<n;j++)
p+=d[j]*e[j];
System.out.println(p);
p=0;
}
}
}