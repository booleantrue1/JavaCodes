import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,p=0,m=0,t=0,l=0,k=0;
String r,s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
int d[]=new int[m];
s=b.readLine();
StringTokenizer x=new StringTokenizer(s);
k=Integer.parseInt(x.nextToken());
t=Integer.parseInt(x.nextToken());
d[0]=k*t;
for(i=1;i<m;i++)
{
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
k=Integer.parseInt(y.nextToken());
t=Integer.parseInt(y.nextToken());
d[i]=k*t+d[i-1];
}
s=b.readLine();
StringTokenizer w=new StringTokenizer(s);
for(i=0;i<n;i++)
{
p=Integer.parseInt(w.nextToken());
l=Arrays.binarySearch(d,p);
if(l<0)
System.out.println((-1)*l);
else
System.out.println(l+1);
}
}
}