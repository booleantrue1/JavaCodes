import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(b.readLine()),i=0;
long k=0;
for(i=0;i<n;i++)
{
k=Long.parseLong(b.readLine());
if(k%2==0)
{
k=k/2;
System.out.println((4+(k-1)*5)+"42");
}
else
{
k=(k+1)/2;
System.out.println((1+(k-1)*5)+"92");
}
}
}
}