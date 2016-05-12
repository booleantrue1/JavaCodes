import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
String s=obj.readLine();
StringTokenizer c=new StringTokenizer(s);
String n="\0",p="\0";
int h=c.countTokens();
for(int i=1;i<h;i++)
{
p=c.nextToken();
n=n+(p.charAt(0))+'.';
}
n=n+(c.nextToken());
n=n.trim();
System.out.println(n);
}
}