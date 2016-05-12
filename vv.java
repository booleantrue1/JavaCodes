import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,n=0,i=0;
n=Integer.parseInt(b.readLine());
String s[];
String q="\0";
s=new String[n];
for(i=0;i<n;i++)
s[i]=b.readLine();
for(i=0;i<n;i++)
if(s[0].compareTo(s[i])!=0)
q=s[i];
for(i=0;i<n;i++)
if(s[0].compareTo(s[i])==0)
f++;
if(f>n/2)
System.out.print(s[0]);
else
System.out.print(q);
}
}