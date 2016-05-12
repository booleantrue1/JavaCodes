import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i,j,k;
String s;
k=Integer.parseInt(b.readLine());
for(j=0;j<k;j++)
{
int count=2;
s=b.readLine();
for(i=1;i<s.length();i++)
{
if(s.charAt(i)>=s.charAt(i-1))
count+=((s.charAt(i)-'0')-(s.charAt(i-1)-'0'));
else
count+=(26-((s.charAt(i-1)-'0')-(s.charAt(i)-'0')));
}
if((count+s.length()-1)<=11*(s.length()))
System.out.println("YES");
else
System.out.println("NO");
}
}
}