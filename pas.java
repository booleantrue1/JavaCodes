import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=1,i=0,rem=0,n=0,m=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
if(m<3*n)
{
System.out.print("-1");
System.exit(0);
}
rem=m%n;
for(i=1;i<m/n+rem;i++)
System.out.print(k+" ");
while(k<n)
{
k++;
for(i=1;i<m/n;i++)
System.out.print(k+" ");
}
for(i=1;i<=n;i++)
System.out.print(i+" ");
}
}