import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m,n,i,k=0,p=0;
String s;
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
m=Integer.parseInt(z.nextToken());
n=Integer.parseInt(z.nextToken());
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
for(i=0;i<m;i++)
{
p=Integer.parseInt(y.nextToken());
k+=p/n;
}
System.out.print(k);
}
}