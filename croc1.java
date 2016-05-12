import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,k=0,n=0,t=0;
String s;
t=Integer.parseInt(b.readLine());
int d[]=new int[t];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<t;i++)
d[i]=Integer.parseInt(c.nextToken());
Arrays.sort(d);
for(i=0;i<t-2;i++)
if(d[i]!=0&&d[i]==d[i+1]&&d[i+1]==d[i+2])
{
System.out.print("-1");
System.exit(0);
}
for(i=0;i<t-1;i++)
if(d[i]!=0&&d[i]==d[i+1])
k++;
System.out.print(k);
}
}