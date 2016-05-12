import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String s,q,r="\0";
char u='\0';
int p=0,n=0,j=0,i=0,k=0,t=0,f=0;
int d[];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
d=new int[n];
q=b.readLine();
StringTokenizer l=new StringTokenizer(q);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(l.nextToken());
for(i=0;i<n;i++)
{
r=String.valueOf(d[i]);
t=r.length();
for(j=0;j<t;j++)
{
u=r.charAt(j);
if(u=='4'||u=='7')
p++;
}
if(p<=k)
f++;
p=0;
}
System.out.print(f);
}
}