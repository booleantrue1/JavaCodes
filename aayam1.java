import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m,i;
String s="\0";
m=Integer.parseInt(b.readLine());
for(i=0;i<m;i++)
{
int n=0;
s=b.readLine();
s=s.replace(","," ");
s=s.replace("."," ");
s=s.replace(";"," ");
s=s.trim();
StringTokenizer c=new StringTokenizer(s);
n=c.countTokens();
System.out.println(n);
}
}
}