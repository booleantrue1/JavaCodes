import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,m=0,n=0,i=0,p=0;
String s;
int d[];
int e[];
int f[]=new int[4];
f[0]=0;
j=Integer.parseInt(b.readLine());
d=new int[j];
e=new int[j];
for(i=0;i<j;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d[i]=Integer.parseInt(c.nextToken());
e[i]=Integer.parseInt(c.nextToken());
}
f[0]=0;
m=0;
n=0;
for(i=0;i<j;i++)
f[0]+=(int)(Math.abs(d[i]-m)+(Math.abs(e[i]-n)));
m=0;
n=1;
for(i=0;i<j;i++)
f[1]+=(int)(Math.abs(d[i]-m)+(Math.abs(e[i]-n)));
m=1;
n=0;
for(i=0;i<j;i++)
f[2]+=(int)(Math.abs(d[i]-m)+(Math.abs(e[i]-n)));
m=1;
n=1;
for(i=0;i<j;i++)
f[3]+=(int)(Math.abs(d[i]-m)+(Math.abs(e[i]-n)));
p=f[0];
for(i=0;i<4;i++)
if(f[i]<p)
p=f[i];
System.out.print(p);
}
}