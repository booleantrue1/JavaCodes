import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,j=0,n=0,k=0,i=0;
n=Integer.parseInt(b.readLine());
String s;
if(n==2)
System.out.print("0");
else
{
if(n==3)
System.out.print("1");
else
{
if(n==5)
System.out.print("2");
else
{
k=3;
for(j=6;j<n;j++)
{
for(i=2;i<=j/2;i++)
{
if(j%i==0)
{
f=1;
break;
}
}
if(f==0)
k++;
f=0;
}
System.out.print(k);
}
}
}
}
}