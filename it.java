import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int l=1,i=0,k=0,j=0,t=0,n=0,p=0;
n=Integer.parseInt(b.readLine());
int d[];
int e[];
String s[];
d=new int[n];
e=new int[n];
s=new String[n];
for(i=0;i<n;i++)
{
s[i]=b.readLine();
StringTokenizer c=new StringTokenizer(s[i]);
d[i]=Integer.parseInt(c.nextToken());
e[i]=Integer.parseInt(c.nextToken());
}
for(j=0;j<n-1;j++)
{
for(i=j+1;i<n;i++)
{
if(e[j]<e[i])
{
t=e[i];
e[i]=e[j];
e[j]=t;
t=d[i];
d[i]=d[j];
d[j]=t;
}
}
}
for(i=0;i<n;i++)
if(e[i]==0)
{
p=i;
break;
}
for(j=p;j<n-1;j++)
{
for(i=j+1;i<n;i++)
{
if(d[j]<d[i])
{
t=d[i];
d[i]=d[j];
d[j]=t;
}
}
}
for(i=0;l!=0&&n!=0;i++)
{
k+=d[i];
l--;
n--;
l+=e[i];
}
System.out.print(k);
}
}