import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,n=0,k=0,p=0,l=0;
double t=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
l=Integer.parseInt(c.nextToken());
t=((1.0/(1-((1-(double)m/n)*(1-(double)k/l))))*((double)m/n)*(1-(double)m/n)*(1-(double)k/l))+((double)m/n);
System.out.print(t);
}
}