import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,p=0,n=0,k=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
s=b.readLine();
char d[]=new char[n];
d=s.toCharArray();
for(i=0;i<k;i++)
{
p=d[].indexOf("47");
if(p<0)
{
System.out.print(s);
System.exit(0);
}
if(p%2==0)
{
d[p]='4';
d[p+1]='4';
s=d.toString();
}
else
{
d[p]='7';
d[p+1]='7';
s=d.toString();
}
}
System.out.print(s);
}
}