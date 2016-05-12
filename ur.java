import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,x=0,y=0,i=0,t=0;
String s,r;
int d[];
j=Integer.parseInt(b.readLine());
d=new int[j];
d[0]=0;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=1;i<j;i++)
d[i]=Integer.parseInt(c.nextToken());
r=b.readLine();
StringTokenizer z=new StringTokenizer(r);
x=Integer.parseInt(z.nextToken());
y=Integer.parseInt(z.nextToken());
for(i=x;i<y;i++)
t+=d[i];
System.out.print(t);
}
}