import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,j=0;
double d=0,p=0;
String s,r="\0";
char q='\0';
s=b.readLine();
n=s.length();
for(i=0;i<n;i++)
{
q=s.charAt(i);
if(q=='>')
r+=1000;
if(q=='<')
r+=1001;
if(q=='+')
r+=1010;
if(q=='-')
r+=1011;
if(q=='.')
r+=1100;
if(q==',')
r+=1101;
if(q=='[')
r+=1110;
if(q==']')
r+=1111;
}
BigInteger m=new BigInteger("0");
BigInteger m2;
BigInteger m4;
BigInteger m3=new BigInteger("1000003");
BigInteger m1=new BigInteger("2");
r=r.trim();
for(i=4*n-1;i>=0;i--,j++)
{
m2=new BigInteger(r.substring(i,i+1));
m4=m1.pow(j);
m=m.add(m2.multiply(m4));
}
System.out.print(m.mod(m3));
}
}