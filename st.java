import java.io.*;
import java.math.*;
class j
{
public static void main(String aa[])throws IOException
{
DataInputStream b=new DataInputStream(System.in);
int k=9,i=0,n=0;
BigInteger p=new BigInteger("1");
char q='\0';
int d[]=new int[10];
d[0]=0;
BigInteger e[]=new BigInteger[10];
for(i=0;i<10;i++)
e[i]=new BigInteger(String.valueOf(i+1));
String s=b.readLine();
n=s.length();
q=s.charAt(0);
if(q=='?')
p=p.multiply(e[8]);
if(q=='A'||q=='B'||q=='C'||q=='D'||q=='E'||q=='F'||q=='G'||q=='H'||q=='I'||q=='J')
{
p=p.multiply(e[8]);
d[(int)q-65]=1;
k--;
}
for(i=1;i<n;i++)
{
q=s.charAt(i);
if(q=='?')
p=p.multiply(e[9]);
else
{
if(q=='A'||q=='B'||q=='C'||q=='D'||q=='E'||q=='F'||q=='G'||q=='H'||q=='I'||q=='J')
{
if(d[(int)q-65]==0)
{
p=p.multiply(e[k]);
k--;
d[(int)q-65]=1;
}
}
}
}
System.out.print(p);
}
}