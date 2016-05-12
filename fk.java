import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0;
String s;
s=b.readLine();
p=s.indexOf('0');
if(p<0)
System.out.print(s.substring(1));
else
System.out.print(s.substring(0,p)+s.substring(p+1));
}
}