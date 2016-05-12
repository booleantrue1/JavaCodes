import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,k=0,n=0,i=0;
String s="\0";
int d[];
int e[];
int f[];
n=Integer.parseInt(b.readLine());
d=new int[n];
e=new int[n];
f=new int[n];
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d[i]=Integer.parseInt(c.nextToken());
e[i]=Integer.parseInt(c.nextToken());
f[i]=d[i]+e[i];
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
continue;
else
{
if(f[i]==d[j]&&f[j]==d[i])
{
k=1;
System.out.print("YES");
break;
}
}
}
if(k==1)
break;
}
if(k==0)
System.out.print("NO");
}
}