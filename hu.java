import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,l=0,k1=0,k=0,m=0,i=0;
m=Integer.parseInt(b.readLine());
int d[]=new int[m];
int e[]=new int[m];
int f[]=new int[m];
int g[]=new int[m];
int h[]=new int[m];
int j[]=new int[m+1];
g[0]=0;
h[0]=0;
j[0]=0;
String s;
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d[i]=Integer.parseInt(c.nextToken());
e[i]=Integer.parseInt(c.nextToken());
f[i]=Integer.parseInt(c.nextToken());
k+=f[i];
j[d[i]]++;
}
for(i=1;i<=m;i++)
{
if(j[i]==2)
{
g[k1]=i;
k1++;
}
if(j[i]==0)
{
h[l]=i;
l++;
}
}
/*for(i=0;i<l;i++)
System.out.println(g[i]+" "+h[i]);*/
Arrays.sort(g);
Arrays.sort(h);
for(i=0;i<m;i++)
if(Arrays.binarySearch(g,d[i])>=0&&Arrays.binarySearch(h,e[i])>=0)
t+=f[i];
System.out.print((long)Math.min(t,k-t));
}
}