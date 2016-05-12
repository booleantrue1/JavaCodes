import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int 
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
if(m==0&&n==0&&p==0)
System.out.print("-1");
if((m==0&&p==0)||(n==0&&p==0))
System.out.print("0");
if(m==0&&n==0)
System.out.print("-1");
if(m==0&&n!=0&&p!=0)
{
System.out.println("1");
System.out.print((-1)*(double)p/n);
}
if()