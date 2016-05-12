import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=1,m=0,i=0;
String s,r="\0";
m=Integer.parseInt(b.readLine());
int d[]=new int[m];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=0;i<m;i++)
if(d[i]==k)
{
r+=(String.valueOf(2001+i))+" ";
k++;
}
System.out.print(k-1+"\n"+r.trim());
}
}