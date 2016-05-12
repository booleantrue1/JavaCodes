import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,j=0,r=0,n=0,l=0;
long u=0;
String s;
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
m=Integer.parseInt(y.nextToken());
n=Integer.parseInt(y.nextToken());
int d[]=new int[m];
int e[]=new int[m];
e[0]=0;
s=b.readLine();
StringTokenizer x=new StringTokenizer(s);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(x.nextToken());
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
l=Integer.parseInt(z.nextToken());
r=Integer.parseInt(z.nextToken());
for(j=l-1;j<r;j++)
e[j]++;
}
Arrays.sort(d);
Arrays.sort(e);
for(i=0;i<m;i++)
u+=(long)e[i]*d[i];
System.out.print(u);
}
}