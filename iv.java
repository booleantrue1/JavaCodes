import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,n=0,t=0,m=0,p=0,k=0;
String s;
n=Integer.parseInt(b.readLine());
int d[]=new int[n];
int g[]=new int[n];
int e[]=new int[n];
int f[]=new int[n];
s=b.readLine();
StringTokenizer c =new StringTokenizer(s);
for(i=0;i<n;i++)
{
d[i]=Integer.parseInt(c.nextToken());
g[i]=d[i];
}
Arrays.sort(g);
for(i=0;i<n;i++)
{
m+=d[i];
k++;
System.out.println(i+" "+m+" "+p);
if(m-p>g[n-1])
{
m-=d[i];
k--;
p+=d[i];
f[t]=i+1;
t++;
System.out.println(i+" "+m+" "+p);
continue;
}
else
{
if(k-t==2)
{
m-=d[i];
k--;
p+=d[i];
if(p-m>g[n-1])
{
p-=d[i];
m+=d[i];
k++;
e[k-1]=i+1;
}
else
{
f[t]=i+1;
t++;
}
System.out.println(i+" "+m+" "+p);
continue;
}
else
{e[k-1]=i+1;System.out.println(i+" "+m+" "+p);}
}
}
System.out.println(k);
for(i=0;i<k;i++)
System.out.print(e[i]+" ");
System.out.println("\n"+t);
for(i=0;i<t;i++)
System.out.print(f[i]+" ");
}
}