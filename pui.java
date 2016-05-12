import java.io.*;
import java.text.*;
import java.util.*;
class j
{
static long findHCF(long a, long b)
{
if(a==0)
return b;
else
return findHCF(b%a,a);
}
static long findLCM(long a, long b, long hcf)
{
return (a*b)/hcf;
}
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j1=0,n=0,i=0,f=0;
long j=0,lcm=1,hcf=1;
String s;
int d[];
while(true)
{
s=b.readLine();
if(s.compareTo("*")==0)
System.exit(0);
n=s.length();
d=new int[n+1];
for(j1=0;j1<n;j1++)
{
if(s.charAt(j1)=='Y')
d[j1+1]=1;
else
d[j1+1]=0;
}
for(j1=1;j1<=n;j1++)
{
if(d[j1]==1)
{
j=(long)j1;
hcf=findHCF(j,hcf);
lcm=findLCM(j,lcm,hcf);
hcf=lcm;
}
}
for(j1=1;j1<=n;j1++)
if(d[j1]==0&&lcm%j1==0)
{
f=1;
break;
}
if(f==1)
System.out.println("-1");
else
System.out.println(lcm);
f=0;
hcf=1;
lcm=1;
}
}
}