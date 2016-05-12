import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,i=0,f=0,k=0,t=0;
BigInteger b1=new BigInteger("1");
BigInteger b6=new BigInteger("0");
BigInteger b2;
BigInteger b3;
BigInteger b4;
BigInteger b5;
k=Integer.parseInt(b.readLine());
BigInteger b7=new BigInteger(String.valueOf(k));
for(i=1;i<k;i++)
{
b2=new BigInteger(String.valueOf(i));
for(j=1;j<k-1;j++)
{
b3=b2.pow(j);
b4=b3.subtract(b1);
b5=b4.mod(b7);
if(b5.compareTo(b6)==0)
{
f=1;
break;
}
}
if(f==0)
{
b3=b2.pow(j);
b4=b3.subtract(b1);
b5=b4.mod(b7);
if(b5.compareTo(b6)==0)
t++;
}
f=0;
}
System.out.print(t);
}
}