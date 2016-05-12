import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,max=-1,n=0,p=0,j=0,k=0,flag=0;
String s;
for(i=999;i>99;i--)
for(j=999;j>99;j--)
{
s=String.valueOf(i*j);
p=s.length();
for(k=0;k<p;k++)
{
if(s.charAt(k)!=s.charAt(p-k-1))
{
flag=1;
break;
}
}
if(flag==0)
{
n=Integer.parseInt(s);
if(n>max)
max=n;
}
flag=0;
}
System.out.print(max);
}
}