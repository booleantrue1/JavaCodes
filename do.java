import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,k=0,i=0,n=0,p=0;
String s;
m=Integer.parseInt(b.readLine());
m=(int)Math.abs(m);
for(i=1;i<100001;i++)
{
k+=i;
if(k>=m)
break;
}
p=2*(k-m);
if(k>m)
{
k-=i;
i--;
}
n=m-k;
p=p+i+1;
n=2*n+i;
System.out.print((long)Math.min(p,n));
}
}