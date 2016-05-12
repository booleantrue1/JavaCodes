import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int r=0,i=0,j=0,f=0,n=0;
char c='\0';
char q='\0';
String s;
String d="\0";
s=b.readLine();
r=s.length();
for(i=0;i<r;i++)
{
c=s.charAt(i);
n=d.length();
for(j=0;j<n;j++)
{
q=d.charAt(j);
if(c==q)
{
f=1;
break;
}
}
if(f==0)
d=d+c;
f=0;
}
n=d.length();
if(n%2==0)
System.out.print("IGNORE HIM!");
else
System.out.print("CHAT WITH HER!");
}
}