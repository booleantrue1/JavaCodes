import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
long counter=0;
int p=1,i=0,n=0,m=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
int d[]=new int[m];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
{
d[i]=Integer.parseInt(z.nextToken());
if(d[i]>=p)
counter+=(long)(d[i]-p);
else
counter+=(long)(n-p+d[i]);
p=d[i];
}
System.out.print(counter);
}
}