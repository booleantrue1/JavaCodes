import java.io.*;
import java.text.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,c=0,k=0,m=0;
String s;
s=b.readLine();
StringTokenizer c1=new StringTokenizer(s);
k=Integer.parseInt(c1.nextToken());
m=Integer.parseInt(c1.nextToken());
if(k>0&&m>0)
{
c=m+k;
System.out.print("0 "+c+" "+c+" 0");
}
if(k<0&&m<0)
{
c=m+k;
System.out.print(c+" 0 0 "+c);
}
if(k>0&&m<0)
{
c=m-k;
System.out.print("0 "+c+" "+(-1)*c+" 0");
}
if(k<0&&m>0)
{
c=m-k;
System.out.print((-1)*c+" 0 0 "+c);
}
}
}