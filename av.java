import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,i=0;
String s,r="\0",t="\0",q="\0";
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
q=c.nextToken();
s=c.nextToken();
k=s.length();
r+="5";
for(i=0;i<k-1;i++)
r+="0";
r=r.trim();
for(i=0;i<k;i++)
t+="9";
t=t.trim();
if(s.compareTo(r)>=0)
{
if(Long.parseLong(q)<=Long.parseLong(r))
{
System.out.print((Long.parseLong(r))*(Long.parseLong(r)-1));
System.exit(0);
}
else
{
System.out.print((Long.parseLong(q))*(Long.parseLong(t)-Long.parseLong(q)));
System.exit(0);
}
}
else
System.out.print((Long.parseLong(s))*(Long.parseLong(t)-Long.parseLong(s)));
}
}