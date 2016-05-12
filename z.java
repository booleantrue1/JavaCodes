import java.io.*;
import java.util.*;
class z
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String d,e;
int r=0,i,j,l,k,v=0,h=0;
d=b.readLine();
StringTokenizer q=new StringTokenizer(d);
for(i=0;i<2;i++)
v=Integer.parseInt(q.nextToken());
e=b.readLine();
StringTokenizer c=new StringTokenizer(e);
StringTokenizer p=new StringTokenizer(e);
l=c.countTokens();
for(i=0;i<v;i++)
h=Integer.parseInt(c.nextToken());
if(h<1)
{
for(i=0;i<l;i++)
{
if((Integer.parseInt(p.nextToken()))>0)
r++;
}
}
else
for(i=0;i<l;i++)
if((Integer.parseInt(p.nextToken()))>=h)
r++;
System.out.print(r);
}
}