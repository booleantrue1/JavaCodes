import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
Scanner b=new Scanner(System.in);
String s;
BigInteger fact[]=new BigInteger[5];
fact[0]=new BigInteger("1");
fact[1]=new BigInteger("1");
fact[2]=new BigInteger("2");
fact[3]=new BigInteger("6");
fact[4]=new BigInteger("4");
BigInteger fac[]=new BigInteger[4];
fac[0]=new BigInteger("6");
fac[1]=new BigInteger("2");
fac[2]=new BigInteger("4");
fac[3]=new BigInteger("8");
BigInteger p=new BigInteger("2");
BigInteger p1=new BigInteger("0");
BigInteger mod=new BigInteger("5");
BigInteger mod1=new BigInteger("4");
BigInteger mod2=new BigInteger("10");
while(b.hasNextLine())
{
BigInteger ans=new BigInteger("1");
BigInteger n=new BigInteger(b.nextLine());
while(true)
{
if(n.divide(mod).compareTo(p1)==0)
break;
BigInteger quo=n.divide(mod);
BigInteger modul=n.mod(mod);
n=n.divide(mod);
BigInteger modu=quo.mod(mod1);
ans=ans.multiply(fac[Integer.parseInt(modu.toString())]);
ans=ans.multiply(fact[Integer.parseInt(modul.toString())]);
ans=ans.mod(mod2);
}
ans=ans.multiply(fact[Integer.parseInt(n.toString())]);
ans=ans.mod(mod2);
System.out.println(ans);
}
}
}