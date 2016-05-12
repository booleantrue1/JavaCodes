import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,x=0,m=0,y=0,t=0;
String s;
t=Integer.parseInt(b.readLine());
s=b.readLine();
s="0"+s;
s=s.replace(" 0","");
s=s.trim();
StringTokenizer c=new StringTokenizer(s);
t=c.countTokens();
int d[]=new int[t];
for(i=0;i<t;i++)
d[i]=Integer.parseInt(c.nextToken());
Arrays.sort(d);
for(i=0;i<t;i++)
if(d[i]%d[0]!=0)
{
System.out.print("-1");
System.exit(0);
}
System.out.print(d[0]);
}
}