import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,p=0,m=0,k=0,n=0;
String s,r="\0",t="\0",q="\0";
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=m%n;
if(m<3*n)
System.out.print("-1");
else
{
for(i=1;i<=n;i++)
{
r+=String.valueOf(i)+" ";
if(i<=p)
q+=String.valueOf(i)+" ";
}
r=r.trim();
q=q.trim();
k=m/n-1;
for(i=1;i<=k;i++)
t+=r+" ";
t=t.trim();
t+=" "+r.substring(2)+" "+"1"+" ";
t+=q;
t=t.trim();
System.out.print(t);
}
}
}