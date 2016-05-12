import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,p=0;
String s,r;
s=b.readLine();
s=s.replace("WUB"," ");
s=s.trim();
StringTokenizer c=new StringTokenizer(s);
p=c.countTokens();
for(i=0;i<p;i++)
{
r=c.nextToken();
System.out.print(r+" ");
}
}
}