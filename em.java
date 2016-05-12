import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
Scanner b=new Scanner(System.in);
String s,r;
s=b.next();
r=b.next();
if(r.length()!=s.length())
System.out.print("NO");
else
{
if(r.indexOf("1")<0)
{
if(s.indexOf("1")<0)
System.out.print("YES");
else
System.out.print("NO");
}
else
{
if(s.indexOf("1")<0)
{
if(r.indexOf("1")<0)
System.out.print("YES");
else
System.out.print("NO");
}
else
System.out.print("YES");
}
}
}
}