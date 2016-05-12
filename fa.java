import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0;
double m=0;
String s,r="\0";
s=b.readLine();
p=s.length();
if(p>20)
System.out.print("BigInteger");
if(p==20)
{
if(s.charAt(0)=='-')
{
r=String.valueOf(-922337203)+String.valueOf(685477580)+String.valueOf(8);
if(r.compareTo(s)<0)
System.out.print("BigInteger");
else
System.out.print("long");
}
else
System.out.print("BigInteger");
}
if(p==19)
{
if(s.charAt(0)!='-')
{
r=String.valueOf(922337203)+String.valueOf(685477580)+String.valueOf(7);
if(r.compareTo(s)<0)
System.out.print("BigInteger");
else
System.out.print("long");
}
else
System.out.print("long");
}
if(p<19)
{
m=Double.parseDouble(s);
if(m>-129&&m<128)
System.out.print("byte");
else
{
if(m>-32769&&m<32768)
System.out.print("short");
else
{
if(m>=-2147483648&&m<=2147483647)
System.out.print("int");
else
System.out.print("long");
}
}
}
}
}