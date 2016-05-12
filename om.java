import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,l=0,n=0,i=0;
String s,r;
s=b.readLine();
r=b.readLine();
n=s.length();
for(i=0;i<n;i++)
{
if(r.charAt(i)!=s.charAt(i))
{
if(r.charAt(i)=='4')
k++;
else
l++;
}
}
System.out.print((int)Math.max(k,l));
}
}