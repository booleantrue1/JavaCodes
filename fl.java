import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,j=0,p=0,i=0;
String s;
p=Integer.parseInt(b.readLine());
int d[]=new int[p];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<p;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=0;i<p-1;i++)
{
for(j=i+1;j<p;j++)
{
for(k=0;k<p;k++)
{
if(d[i]+d[j]==d[k])
{
System.out.print((k+1)+" "+(j+1)+" "+(i+1));
System.exit(0);
}
}
}
}
System.out.print("-1");
}
}