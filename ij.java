import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,i=0,p=0,k=0;
String s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
k=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
int d[]=new int[k];
d[0]=0;
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
d[Integer.parseInt(z.nextToken())-1]=1;
d[Integer.parseInt(z.nextToken())-1]=1;
}
for(i=0;i<k;i++)
if(d[i]==0)
{
p=i+1;
break;
}
System.out.println(k-1);
for(i=0;i<k;i++)
if(i+1!=p)
System.out.println(p+" "+(i+1));
}
}