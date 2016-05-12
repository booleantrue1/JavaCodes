import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0;
String r,s;
r=b.readLine();
s=b.readLine();
r=r.toUpperCase();
s=s.toUpperCase();
p=r.compareTo(s);
if(p<0)
System.out.print("-1");
if(p==0)
System.out.print("0");
if(p>0)
System.out.print("1");
}
}