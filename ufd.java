import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,i=0,y=0,x=0,n=0,t=0;
String s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
int d[]=new int[n];
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
x=Integer.parseInt(z.nextToken());
y=Integer.parseInt(z.nextToken());
d[x-1]=1;
}
d[0]=1;
d[n-1]=1;
for(i=0;i<n;i++)
if(d[i]==0)
t++;
System.out.print(t);
}
}