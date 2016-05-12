import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,t=0,j=0,i=0,n=0;
String r,s;
r=b.readLine();
StringTokenizer c=new StringTokenizer(r);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
s=b.readLine();
while(true)
{
for(j=1;j<=k;j++)
{
if(s.charAt(i+j)=='.')
{
i=i+j;
t=1;
break;
}
}
if(t==0)
{
System.out.print("NO");
System.exit(0);
}
t=0;
if(i==n-1)
{
System.out.print("YES");
System.exit(0);
}
}
}
}