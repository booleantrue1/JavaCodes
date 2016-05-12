import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,i=0,n=0,t=0;
n=Integer.parseInt(b.readLine());
String s;
s=b.readLine();
t=s.length();
for(i=n;i<t;i+=n)
if(s.charAt(i-1)==s.charAt(i-2)&&s.charAt(i-2)==s.charAt(i-3))
m++;
System.out.print(m);
}
}