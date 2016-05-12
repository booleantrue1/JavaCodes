import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,g=0,f=0,k=0;
String s;
s=b.readLine();
s=s.trim();
n=s.length();
System.out.print("<");
for(i=0;i<n;i++)
{
if(s.charAt(i)=='"')
{
k=0;
if(f==0)
f=1;
else
{
f=0;
System.out.println(">");
if(i<n-1)
System.out.print("<");
continue;
}
}
if(f==1&&s.charAt(i)!='"')
System.out.print(s.charAt(i));
if(f==0)
{
k=1;
if(s.charAt(i)!=' ')
{
g=1;
System.out.print(s.charAt(i));
}
if(s.charAt(i)==' '&&g==1)
{
System.out.println(">");
g=0;
if(i<n-1)
System.out.print("<");
continue;
}
if(s.charAt(i)==' '&&g==0)
continue;
}
}
if(k==1)
System.out.print(">");
}
}