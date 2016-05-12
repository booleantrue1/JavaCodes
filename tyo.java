import java.io.*;
import java.util.*;
class j
{
public static void main(String[] args)throws IOException
{
long a,i,sum=0,j,n;
double p=0;
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
n=Long.parseLong(b.readLine());
for(j=0;j<n;j++)
{
sum=0;
a=Long.parseLong(b.readLine());
for(i=2;i*i<=a;i++)
{
if((a%i)==0)
{ 
if(a/i==i)
{
sum=sum+i;
}
else
{
sum=sum+i+(a/i);
}
}
}
if(a==1)
System.out.println("0");
else
System.out.println(sum+1);
}
}
}