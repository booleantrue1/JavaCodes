import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,i=0,n=0,u=0,v=0,x=0,y=0;
double a=0,t=0,l=0;
String e[];
String d;
d=b.readLine();
StringTokenizer c=new StringTokenizer(d);
n=Integer.parseInt(c.nextToken());
e=new String[n];
k=Integer.parseInt(c.nextToken());
for(i=0;i<n;i++)
e[i]=b.readLine();
for(i=0;i<n-1;i++)
{
StringTokenizer g=new StringTokenizer(e[i]);
StringTokenizer h=new StringTokenizer(e[i+1]);
u=Integer.parseInt(g.nextToken());
v=Integer.parseInt(g.nextToken());
x=Integer.parseInt(h.nextToken());
y=Integer.parseInt(h.nextToken());
a=Math.sqrt(Math.pow((u-x),2)+Math.pow((v-y),2));
l+=a;
}
t=l/50;
System.out.print(t*k);
}
}