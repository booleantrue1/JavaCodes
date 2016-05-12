import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0;
String s,r="\0";
s=b.readLine();
r=s.substring(0,1);
s=s.substring(1);
r=r.toUpperCase();
r=r+s;
System.out.print(r.trim());
}
}