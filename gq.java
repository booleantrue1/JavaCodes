import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,k=0,j=0,m=0;
String s;
n=Integer.parseInt(b.readLine());
for(i=1;i<=n;i++)
{
for(j=i;j<=n;j++)
{
m=i*i+j*j;
if(Math.sqrt(m)==(long)Math.sqrt(m)&&(long)Math.sqrt(m)<=n)
k++;
}
}
System.out.print(k);
}
}
