import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int q=0,k=0,p=0,n=0,m=0,i=0;
long u=0,v=0,w=0,x=0;
m=Integer.parseInt(b.readLine());
String s,r="\0",z="\0";
int d[]=new int[m];
int e[]=new int[m];
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d[i]=Integer.parseInt(c.nextToken());
e[i]=Integer.parseInt(c.nextToken());
if(i%2==0)
{
r+="A";
u+=(d[i]);
}
else
{
r+="G";
v+=(e[i]);
}
if(i%2==0)
{
z+="G";
w+=(e[i]);
}
else
{
z+="A";
x+=(d[i]);
}
}
if((u-v)<=500&&(u-v)>=-500)
System.out.print(r.trim());
else
if((w-x)<=500&&(w-x)>=-500)
System.out.print(z.trim());
else
System.out.print("-1");
}
}