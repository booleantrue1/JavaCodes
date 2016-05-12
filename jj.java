import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,k=0,i=0,j=0,g=0,h=0;
int d[];
String s;
d=new int[5];
m=Integer.parseInt(b.readLine());
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
if(m==3||m==4)
{
for(i=0;i<m;i++)
{
j=Integer.parseInt(c.nextToken());
k+=j;
}
System.out.print(k);
}
if(m>5)
{
for(i=0;i<m;i++)
{
j=Integer.parseInt(c.nextToken());
if(i%2==0)
g+=j;
else
h+=j;
}
if(g<=0)
{
if(h>=0)
System.out.print(h);
else
{
if(g>=h)
System.out.print(g);
else
System.out.print(h);
}
}
else
{
if(h<0)
System.out.print(g);
else
System.out.print(g+h);
}
}
if(m==5)
{
for(i=0;i<5;i++)
{
d[i]=Integer.parseInt(c.nextToken());
k+=d[i];
}
if(d[1]+d[3]<0)
System.out.print(k-d[1]-d[3]);
else
System.out.print(k);
}
}
}