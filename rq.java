import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,i=0,w=0,p=0;
int d[];
String s;
double t=0;
j=Integer.parseInt(b.readLine());
d=new int[j+1];
d[0]=0;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=1;i<=j;i++)
d[i]=Integer.parseInt(c.nextToken());
for(p=0;p<j;p++)
for(i=p+1;i<j+1;i++)
if(d[p]>d[i])
{
w=d[p];
d[p]=d[i];
d[i]=w;
}
if(j%2==1)
{
for(i=1;i<=j;i++)
{
if(i%2==1)
t+=((3.141592653589793)*((d[i]*d[i])-(d[i-1]*d[i-1])));
}
}
else
{
for(i=1;i<=j;i++)
{
if(i%2==0)
t+=((3.141592653589793)*((d[i]*d[i])-(d[i-1]*d[i-1])));
}
}
System.out.print(t);
}
}