import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,n=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
while(true)
{
for(i=1;i<=n;i++)
{
m=m-i;
if(m<0)
break;
}
if(m<0)
break;
}
m=m+i;
System.out.print(m);
}
}