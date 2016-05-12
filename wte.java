import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n,i,j;
String s;
BigInteger p=new BigInteger("2");
BigInteger mod=new BigInteger("1000000007");
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
j=Integer.parseInt(b.readLine());
System.out.println(p.pow(j-1).mod(mod));
}
}
}