import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,v=0,m=0,n=0,i=0,s=0,j=0;
String y;
int d[]=new int[3];
y=b.readLine();
StringTokenizer c=new StringTokenizer(y);
d[0]=Integer.parseInt(c.nextToken());
d[1]=Integer.parseInt(c.nextToken());
d[2]=Integer.parseInt(c.nextToken());
for(j=0;j<2;j++)
for(i=j+1;i<3;i++)
if(d[j]>d[i])
{
s=d[j];
d[j]=d[i];
d[i]=s;
}
for(;m!=d[1];m++)
{
t+=d[0];
d[0]++;
n++;
}
d[0]--;
v=t-d[0];
for(;n!=d[2];n++)
t+=d[0];
t+=v;
System.out.print(t);
}
}