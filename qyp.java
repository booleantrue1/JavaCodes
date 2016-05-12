import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,i=0,count=0;
String s;
long n=0;
for(j=1;;j++)
{
n=j*(j+1)/2;
count=0;
for(i=1;i*i<=n;i++)
{
if(n%i==0)
{
if(n/i==i)
count++;
else
count+=2;
}
}
if(count>500)
{
System.out.print(n);
System.exit(0);
}
}
}
}