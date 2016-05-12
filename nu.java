import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,n=0,k=0,left=0,right=0; 
String s,r;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
left=m+1;
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
r=z.nextToken();
r=z.nextToken();
r=z.nextToken();
r=z.nextToken();
r=z.nextToken();
if(s.indexOf("left")>=0)
{
k=Integer.parseInt(r);
if(k<left)
left=k;
}
else
{
k=Integer.parseInt(r);
if(k>right)
right=k;
}
}
if(left-right-1<1)
System.out.print("-1");
else
System.out.print(left-right-1);
}
}