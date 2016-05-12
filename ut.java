import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,p=0,j=0,n=0,i=0;
int d[];
int e[];
String s;
n=Integer.parseInt(b.readLine());
d=new int[n];
e=new int[101];
int f[]=new int[101];
f[0]=0;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=0;i<101;i++)
for(j=0;j<n;j++)
if(d[j]==i)
f[i]++;
for(i=0;i<101;i++)
{
e[i]=f[i]/4;
f[i]=f[i]%4;
t+=e[i];
}
for(i=0;i<101;i++)
if(f[i]==2||f[i]==3)
p++;
t+=p/2;
System.out.print(t);
}
}