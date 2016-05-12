import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,p=0;
String s;
n=Integer.parseInt(b.readLine());
int d[]=new int[n];
d[0]=0;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d[0]=Integer.parseInt(c.nextToken());
for(i=1;i<n;i++)
d[i]=d[i-1]+Integer.parseInt(c.nextToken());
for(i=0;i<n-1;i++)
if(d[i]==d[n-1]-d[i])
p++;
System.out.print(p);
}
}