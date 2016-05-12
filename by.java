import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,k=0,n=0,l=0;
String s;
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
m=Integer.parseInt(y.nextToken());
n=Integer.parseInt(y.nextToken());
int d[]=new int[m];
int e[]=new int[m];
int f[]=new int[m];
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
d[i]=Integer.parseInt(z.nextToken());
e[i]=Integer.parseInt(z.nextToken());
k+=d[i];
l+=e[i];
}
if(n<k||n>l)
System.out.print("NO");
else
{
System.out.println("YES");
for(i=0;i<m;i++)
f[i]=d[i];
n-=k;
for(i=0;;i++)
{
f[i%m]++;
n--;
if(f[i%m]>e[i%m])
{
f[i%m]--;
n++;
}
if(n==0)
break;
}
for(i=0;i<m;i++)
System.out.print(f[i]+" ");
}
}
}