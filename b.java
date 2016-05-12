import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int d=0,e=0,f=0,g=0,h=0,j=0,i=0;
String r,s;
int l[];
int m[];
d=Integer.parseInt(b.readLine());
l=new int[d];
r=b.readLine();
StringTokenizer c=new StringTokenizer(r);
e=Integer.parseInt(b.readLine());
m=new int[e];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<d;i++)
l[i]=Integer.parseInt(c.nextToken());
for(i=0;i<e;i++)
m[i]=Integer.parseInt(z.nextToken());
for(j=0;j<e;j++)
{
for(i=0;i<d;i++)
{
if(m[j]%l[i]==0)
{
f=m[j]/l[i];
if(f>g)
{
g=f;
h=1;
}
else 
{
if(f==g)
h++;
}
}
}
}
System.out.print(h);
}
}