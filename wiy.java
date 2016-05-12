import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i,j;
String s;
BigInteger prime[]=new BigInteger[100];
prime[0]=new BigInteger("2");prime[1]=new BigInteger("3");prime[2]=new BigInteger("5");prime[3]=new BigInteger("7");
prime[4]=new BigInteger("11");prime[5]=new BigInteger("13");prime[6]=new BigInteger("17");prime[7]=new BigInteger("19");
prime[8]=new BigInteger("23");prime[9]=new BigInteger("29");prime[10]=new BigInteger("31");prime[11]=new BigInteger("37");
prime[12]=new BigInteger("41");prime[13]=new BigInteger("43");prime[14]=new BigInteger("47");prime[15]=new BigInteger("53");
prime[16]=new BigInteger("59");prime[17]=new BigInteger("61");prime[18]=new BigInteger("67");prime[19]=new BigInteger("71");
prime[20]=new BigInteger("73");prime[21]=new BigInteger("79");prime[22]=new BigInteger("83");prime[23]=new BigInteger("89");
prime[24]=new BigInteger("97");prime[25]=new BigInteger("101");prime[26]=new BigInteger("103");
BigInteger pr=new BigInteger("1");
for(i=1;i<27;i++)
prime[i]=prime[i-1].multiply(prime[i]);
for(i=0;i<20;i++)
{
s=b.readLine();
if(s.compareTo("1")==0)
System.out.println("1");
else
{
BigInteger search=new BigInteger(s);
for(j=0;j<27;j++)
if(prime[j].compareTo(search)>=0)
break;
if(prime[j].compareTo(search)==0)
System.out.println(prime[j]);
else
System.out.println(prime[j-1]);
}
}
}
}