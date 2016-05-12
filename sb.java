import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,k=0,p=0,n=0;
String s;
s=b.readLine();
n=s.length();
if(s.charAt(0)=='@'||s.charAt(n-1)=='@')
{
System.out.print("No solution");
System.exit(0);
}
for(i=0;i<n-2;i++)
if(s.charAt(i)=='@'&&(s.charAt(i+2)=='@'||s.charAt(i+1)=='@'))
{
System.out.print("No solution");
System.exit(0);
}
for(i=0;i<n;i++)
if(s.charAt(i)=='@')
k++;
if(k==0)
{
System.out.print("No solution");
System.exit(0);
}
for(i=0;i<k-1;i++)
{
p=s.indexOf("@");
System.out.print(s.substring(0,p+2)+",");
s=s.substring(p+2);
}
System.out.print(s);
}
}