import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,p=0,m=0;
String s;
n=Integer.parseInt(b.readLine());
for(i=2;i<n;i++)
{
m=n;
while(m/i!=0)
{
p+=m%i;
m=m/i;
}
p+=m;
}
n=n-2;
m=(int)Math.min(p,n);
for(i=m;i>0;i--)
if(p%i==0&&n%i==0)
break;
System.out.print((p/i)+"/"+(n/i));
}
}