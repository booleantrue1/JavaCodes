import java.io.*;
import java.text.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,n=0,t=0;
double k=0;
String s,r="\0";
DecimalFormat f=new DecimalFormat(".00");
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Double.parseDouble(c.nextToken());
if(k-n<0.5)
{
System.out.print(f.format(k));
System.exit(0);
}
else
{
if(n%5==0)
System.out.print(f.format(k-n-0.50));
else
System.out.print(f.format(k));
}
}
}