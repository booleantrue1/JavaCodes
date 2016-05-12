import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,n=0,k=0,p=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
int d[]=new int[m];
d[0]=0;
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
k=Integer.parseInt(z.nextToken());
p=Integer.parseInt(z.nextToken());
d[k-1]++;
d[p-1]++;
}
Arrays.sort(d);
if(d[m-1]==n)
{
System.out.print("star topology");
System.exit(0);
}
if(d[m-1]==2&&d[0]==d[m-1])
{
System.out.print("ring topology");
System.exit(0);
}
if(d[m-1]==2&&d[0]==d[1]&&d[0]==1)
{
System.out.print("bus topology");
System.exit(0);
}
System.out.print("unknown topology");
}
}