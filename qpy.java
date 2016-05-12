import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b = new BufferedReader(new FileReader("input.txt"));
int i=0,sum=0,p=0;
String s;
BigInteger ans=new BigInteger("2");
ans=ans.pow(1000);
s=ans.toString();
p=s.length();
for(i=0;i<p;i++)
sum+=Integer.parseInt(s.substring(i,i+1));
System.out.print(sum);
}
}