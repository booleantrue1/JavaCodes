import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,z=0,g=0,m=0,n=0,f=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
f=Integer.parseInt(c.nextToken());
z=m/n;
for(i=z+1;g<f;i++)
{
g=n*i;
if(g<=f)
{
k=1;
System.out.print(g-m+" ");
}
if(g>f&&k==0)
System.out.print("-1");
}
}
}