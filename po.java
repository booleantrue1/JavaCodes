import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
long i=0,m=0,max=-1,n=0;
String s;
m=Long.parseLong(b.readLine());
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
for(i=0;i<m;i++)
{
n=Long.parseLong(y.nextToken());
if(n>max)
max=n;
}
if(max-m+1<=0)
System.out.print("0");
else
System.out.print(max-m+1);
}
}