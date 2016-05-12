import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,x=0,m=0,y=0,t=0;
String s;
t=Integer.parseInt(b.readLine());
int d[]=new int[t];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<t;i++)
d[i]=Integer.parseInt(c.nextToken());
m=Integer.parseInt(b.readLine());
if(t>1)
{
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
x=Integer.parseInt(z.nextToken());
y=Integer.parseInt(z.nextToken());
if(x==1)
{
d[1]+=(d[0]-y);
d[0]=0;
}
else
{
if(x==t)
{
d[t-2]+=(y-1);
d[t-1]=0;
}
else
{
d[x-2]+=(y-1);
d[x]+=(d[x-1]-y);
d[x-1]=0;
}
}
}
for(i=0;i<t;i++)
System.out.println(d[i]);
}
else
{
if(m==1)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
x=Integer.parseInt(z.nextToken());
y=Integer.parseInt(z.nextToken());
System.out.print("0");
}
else
System.out.print(d[0]);
}
}
}