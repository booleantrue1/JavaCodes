import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,n=0,A=0,B=0;
double X=0,p=0;
String r;
r=b.readLine();
StringTokenizer c=new StringTokenizer(r);
A=Integer.parseInt(c.nextToken());
B=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=(Math.log10((double)B/A))/n;
X=Math.pow(10,p);
if(X==(int)X)
System.out.print(X);
else
System.out.print("No solution");
}
}


7597828292
25/- rs wala bsnl ka validity recharge.