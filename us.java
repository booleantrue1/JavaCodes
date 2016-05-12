import java.io.*;
import java.text.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,k=0,m=0;
String s;
DecimalFormat f=new DecimalFormat("##.00");
double t=0;
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
k=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
if(k>=0&&m>=0&&(k==m||k-m==2))
{
if(k%2==0&&m%2==0)
System.out.println(k+m);
else
System.out.println(k+m-1);
}
else
System.out.println("No Number");
}
}
}