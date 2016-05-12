import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0;
String s,r="\0";
s=b.readLine();
n=s.length();
for(i=0;i<n;i++)
{
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
{
if(s.charAt(i+1)=='p'&&s.charAt(i+2)==s.charAt(i))
r+=s.charAt(i);
i+=2;
}
else
r+=s.charAt(i);
}
System.out.print(r.trim());
}
}