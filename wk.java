import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,n=0,m=0,t=0,i=0,j=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
int d[]=new int[m];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(z.nextToken());
for(i=0;i<m-1;i++)
{
for(j=i+1;j<m;j++)
{
if(d[j]<d[i])
{
t=d[j];
d[j]=d[i];
d[i]=t;
}
}
}
System.out.print(d[p]-d[p-1]);
}
}