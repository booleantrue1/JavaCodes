import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
Scanner b=new Scanner(System.in);
int i,n,m=0,p=0;
String s;
s=b.next();
n=s.length();
for(i=0;i<n;i++)
{
if(((int)(s.charAt(i)))==41)
{
if(m==0)
p++;
else
m--;
}
else
m++;
}
System.out.print(n-m-p);
}
}