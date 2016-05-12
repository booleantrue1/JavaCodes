import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
long i=0,j=0,k=0,n=0,l=0,mid=0,val=0;
String s;
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
n=Long.parseLong(z.nextToken());
k=Long.parseLong(z.nextToken());
for(i=0,j=n;(j-i)!=1;)
{
mid=(i+j)/2;
val=0;
for(l=mid;l>0;l/=k)
val+=l;
if(val>=n)
j=mid;
else
i=mid;
}
System.out.print(j);
}
}