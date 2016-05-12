import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,j=0,m=0,i=0;
int d[]=new int[101];
d[0]=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
int e[]=new int[m];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
e[i]=Integer.parseInt(z.nextToken());
for(i=n;i<101;i++)
for(j=0;j<m;j++)
d[i]+=e[j]/i;
for(i=0;i<101;i++)
d[i]=d[i]*i;
Arrays.sort(d);
System.out.print(d[100]);
}
}