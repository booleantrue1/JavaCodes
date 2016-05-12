import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,m=0,t=0;
String s;
n=Integer.parseInt(b.readLine());
int d[]=new int[5];
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
t=Integer.parseInt(c.nextToken());
d[m-1]++;
d[t-1]++;
}
for(i=0;i<5;i++)
if(d[i]!=2)
{
System.out.print("WIN");
System.exit(0);
}
System.out.print("FAIL");
}
}