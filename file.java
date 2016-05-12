import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b = new BufferedReader(new FileReader("input.txt"));
int i=0;
String s;
BigInteger ans=new BigInteger("0");
for(i=0;i<100;i++)
{
s=b.readLine();
BigInteger d=new BigInteger(s);
ans=ans.add(d);
}
s=ans.toString();
System.out.print(s.substring(0,10));
}
}