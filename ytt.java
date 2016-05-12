import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0;
String s=b.readLine();
i=s.indexOf('0');
if(i>=0)
System.out.print(s.substring(0,i)+s.substring(i+1));
else
System.out.print(s.substring(1));
}
}