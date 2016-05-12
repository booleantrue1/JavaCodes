import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,m=0,n=0,h=0,j=0,i=0,f=0;
String u="\0",y,z;
y=b.readLine();
StringTokenizer c=new StringTokenizer(y);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
String s[];
s=new String[k];
String r[];
r=new String[k];
z=b.readLine();
StringTokenizer d=new StringTokenizer(z);
for(i=0;i<k;i++)
{
s[i]=d.nextToken();
r[i]=s[i];
}
for(i=1;i<=n*k;i++)
{
u=String.valueOf(i);
for(j=0;j<k;j++)
{
if(u.compareTo(s[j])==0)
{
f=1;
break;
}
}
if(f==0)
{
r[m]+=" "+u;
h++;
if(h==n-1)
{
m++;
h=0;
}
}
f=0;
}
for(i=0;i<k;i++)
System.out.println(r[i]);
}
}