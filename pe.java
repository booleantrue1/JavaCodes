import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=1001,u=-1000,x=0,y=0,k=0,m=0,n=0,i=0;
String r;
r=b.readLine();
String s[];
int d[];
int e[];
StringTokenizer c=new StringTokenizer(r);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
s=new String[m];
d=new int[m];
e=new int[m];
for(i=0;i<m;i++)
s[i]=b.readLine();
for(i=0;i<m;i++)
{
x=s[i].indexOf("*");
y=s[i].lastIndexOf("*");
if(x==-1&&k==0)
{
d[i]=-2;
e[i]=-2;
}
else
{
k=1;
d[i]=x;
e[i]=y;
}
}
i=m-1;
while(d[i]==-1)
{
d[i]=-2;
e[i]=-2;
i--;
}
for(i=0;i<m;i++)
{
if(d[i]<t&&d[i]!=-1&&d[i]!=-2)
t=d[i];
if(e[i]>u&&e[i]!=-1&&e[i]!=-2)
u=e[i];
}
for(i=0;i<m;i++)
{
if(d[i]!=-2)
System.out.println(s[i].substring(t,u+1));
}
}
}