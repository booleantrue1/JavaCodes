import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
Scanner b=new Scanner(System.in);
BigInteger z=new BigInteger("2");
int c=Integer.parseInt(b.nextLine());
System.out.print(c);
BigInteger n=z.pow(c);
BigInteger x=new BigInteger("1");
BigInteger p=n.add(x);
c--;
BigInteger q=z.pow(c);
BigInteger d=p.multiply(q);
System.out.println(d);
}
}