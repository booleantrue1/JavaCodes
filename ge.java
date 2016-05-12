import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,p=0,m=0,i=0;
m=Integer.parseInt(b.readLine());
String s;
int d[]=new int[m];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=0;i<m;i++)
if(d[i]!=i+1)
{
k=i;
break;
}
for(i=m-1;i>=0;i--)
if(d[i]!=i+1)
{
p=i;
break;
}
if(k==p)
{
System.out.print("0 0");
System.exit(0);
}
for(i=k;i<p;i++)
if(d[i+1]>d[i])
{
System.out.print("0 0");
System.exit(0);
}
System.out.print(k+1+" "+(p+1));
}
}