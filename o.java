import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,j=0,i=0,s=0,n=0,f=0;
String e[];
String d;
int m[];
int t[];
d=b.readLine();
StringTokenizer c=new StringTokenizer(d);
s=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
e=new String[n];
m=new int[n];
t=new int[n];
for(i=0;i<n;i++)
e[i]=b.readLine();
for(i=0;i<n;i++)
{
StringTokenizer g=new StringTokenizer(e[i]);
m[i]=Integer.parseInt(g.nextToken());
t[i]=Integer.parseInt(g.nextToken());
}
for(j=0;j<n-1;j++)
{
for(i=j+1;i<n;i++)
{
if(m[j]>m[i])
{
k=m[j];
m[j]=m[i];
m[i]=k;
k=t[j];
t[j]=t[i];
t[i]=k;
}
}
}
for(i=0;i<n;i++)
{
if(s<=m[i])
{
System.out.print("NO");
f=1;
break;
}
else
s+=t[i];
}
if(f==0)
System.out.print("YES");
}
}