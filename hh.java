import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,k=0,i=0,j=0,f=0;
int d[];
int e[];
int g[];
String s[];
m=Integer.parseInt(b.readLine());
d=new int[m];
e=new int[m];
g=new int[m];
s=new String[m];
for(i=0;i<m;i++)
s[i]=b.readLine();
for(i=0;i<m;i++)
{
StringTokenizer c=new StringTokenizer(s[i]);
d[i]=Integer.parseInt(c.nextToken());
e[i]=Integer.parseInt(c.nextToken());
g[i]=Integer.parseInt(c.nextToken());
k+=d[i];
j+=e[i];
f+=g[i];
}
if(k==0&&j==0&&f==0)
System.out.print("YES");
else
System.out.print("NO");
}
}