import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,f=0;
long m=0,h1=0,h2=0,h3=0,i=0,j=0,k=0;
long d[]=new long[3];
n=Integer.parseInt(b.readLine());
if(n==1)
System.out.print("1");
if(n==2)
System.out.print("2");
if(n==3)
System.out.print("6");
if(n>3)
{
for(i=n;;i--)
{
for(j=2;j<=(int)Math.sqrt(i);j++)
if(i%j==0)
{
f=1;
break;
}
if(f==0)
{
k=i;
break;
}
f=0;
}
System.out.println(k);
if(n-k>1)
{
d[0]=k;
d[1]=k+1;
d[2]=k+2;
}
if(n-k==1)
{
d[0]=k-1;
d[1]=k;
d[2]=k+1;
}
if(n==k)
{
d[0]=n-2;
d[1]=n-1;
d[2]=n;
}
m=(d[0]<d[1])?d[0]:d[1];
for(i=m;;i--)
if(d[0]%i==0&&d[1]%i==0)
{
h1=i;
break;
}
m=(d[1]<d[2])?d[1]:d[2];
for(i=m;;i--)
if(d[1]%i==0&&d[2]%i==0)
{
h2=i;
break;
}
m=(d[0]<d[2])?d[0]:d[2];
for(i=m;;i--)
if(d[0]%i==0&&d[2]%i==0)
{
h3=i;
break;
}
System.out.print((d[0]*d[1]*d[2])/(h1*h2*h3));
}
}
}