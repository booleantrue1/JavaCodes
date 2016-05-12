import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,j=0,k=0;
boolean p;
n=Integer.parseInt(b.readLine());
if(n==1)
System.out.print("1");
else
{
for(j=1;j<=(int)Math.sqrt(n);j++)
if(n%j==0)
{
p=check(n,j);
if(p)
k++;
}
System.out.print(k+1);
}
}
static boolean check(int u,int m)
{
int i=0;
String r,s;
r=String.valueOf(u);
s=String.valueOf(m);
for(i=0;i<s.length();i++)
if(r.indexOf(s.charAt(i))>=0)
return(true);
return(false);
}
}