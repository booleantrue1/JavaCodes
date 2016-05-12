import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,f=0,j=0,k=0,p=0,m=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
int d[]=new int[m];
d[0]=0;
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
k=Integer.parseInt(z.nextToken());
p=Integer.parseInt(z.nextToken());
for(j=k-1;j<p;j++)
d[j]++;
}
for(i=0;i<m;i++)
if(d[i]!=1)
{
f=1;
break;
}
if(f==0)
System.out.print("OK");
else
System.out.print(i+1+" "+(d[i]));
}
}