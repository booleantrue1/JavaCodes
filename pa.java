import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,n=0,k=0,t=0; 
String s,r;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
t=Integer.parseInt(c.nextToken());
m=n*k*t/100;
for(i=0;i<m/k;i++)
System.out.print(k+" ");
if(m%k==0)
for(i=0;i<n-m/k;i++)
System.out.print("0 ");
else
{
System.out.print(m%k);
for(i=0;i<n-m/k-1;i++)
System.out.print(" 0");
}
}
}