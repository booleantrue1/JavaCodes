import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,k=0,p=0,j=0,m=0,i=0;
long n=0,e=0;
m=Integer.parseInt(b.readLine());
int d[]=new int[m];
int f[]=new int[m];
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<m;i++)
{
d[i]=Integer.parseInt(c.nextToken());
f[i]=d[i];
}
Arrays.sort(f);
n=f[m-1];
for(i=0;i<m-1;i++)
{
for(j=i+1;j<m;j++)
{
e=d[i];
for(k=i+1;k<=j;k++)
e=(e^d[k]);
if(e>n)
n=e;
}
}
System.out.print(n);
}
}