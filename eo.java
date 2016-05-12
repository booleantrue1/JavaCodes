import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,x=0,y=0,m=0,n=0,a=0,i=0;
String g,f,o,r,t;
n=Integer.parseInt(b.readLine());
int d[];
int e[];
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d=new int[n];
e=new int[n];
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=0;i<n-1;i++)
e[i]=(int)Math.abs(d[i]-d[i+1]);
e[n-1]=(int)Math.abs(d[n-1]-d[0]);
for(j=0;j<n-1;j++)
{
for(i=j+1;i<n;i++)
{
if(e[j]>e[i])
{
a=e[j];
e[j]=e[i];
e[i]=a;
}
}
}
System.out.print(e[0]);
}
}