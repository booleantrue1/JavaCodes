import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,n=0;
String s,r="\0";
s=b.readLine();
n=s.length();
char q[]=new char[n];
q=s.toCharArray();
if(n%2==0)
{
for(i=0;i<n/2;i++)
q[n-1-i]=q[i];
for(i=0;i<n;i++)
System.out.print(q[i]);
}
else
{
for(i=0;i<n/2;i++)
q[n-1-i]=q[i];
for(i=0;i<n;i++)
System.out.print(q[i]);
}
}
}