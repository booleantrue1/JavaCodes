import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
Scanner b=new Scanner(System.in);
String r="\0";
int x=2;
r=b.nextLine();
BigInteger m=new BigInteger(r);
//BigInteger x=new BigInteger("-1");
//BigInteger p=m.pow(100);
r=b.nextLine();
BigInteger n=new BigInteger(r);
BigInteger p=m.mod(n);
System.out.println(p);
}
}