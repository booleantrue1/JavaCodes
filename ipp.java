import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,f1=0,g=0;
String s;
n=Integer.parseInt(b.readLine());
int d[]=new int[n];
int e[]=new int[n];
int f[]=new int[n];
e[0]=0;
f[0]=0;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
e[0]=d[0];
f[n-1]=d[n-1];
for(i=1;i<n;i++)
{
e[i]=e[i-1]+d[i];
f[n-i-1]=d[n-i-1]+f[n-i];
}
for(i=0;i<n;i++)
{
if(e[i]==f[i])
{
f1=1;
break;
}
if(e[i]>f[i])
{
g=1;
break;
}
}
if(f1==1)
System.out.print(i+1+" "+(n-i-1));
if(g==1)
System.out.print(i+" "+(n-i));
}
}