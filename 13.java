import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,p=0,n=0,m=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
m=m-2;
for(i=2;(m>0||n>0||p>0);i++)
{
if(i%3==1&&m>0)
m=m-2;
if(i%3==2&&n>0)
n=n-2;
if(i%3==0&&p>0)
p=p-2;
}
System.out.print(28+i);
}
}