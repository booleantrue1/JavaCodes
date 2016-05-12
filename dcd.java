import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
long count=0;
int p=0,i=0,m=0;
String s;
m=Integer.parseInt(b.readLine());
long d[]=new long[m];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d[0]=Long.parseLong(c.nextToken());
for(i=1;i<m;i++)
{
d[i]=Long.parseLong(c.nextToken());
if(d[i]<d[i-1])
count+=d[i-1]-d[i];
}
System.out.print(count);
}
}