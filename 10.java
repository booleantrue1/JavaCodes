import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,k=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
if(k>=n*(n-1)/2)
System.out.print("no solution");
else
{
for(i=0;i<n;i++)
System.out.println("0 "+i);
}
}
}