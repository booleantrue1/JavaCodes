import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String s[];
int i=0,j=0,w=0,x=0,y=0,z=0,t=0,n=0;
int d[];
int e[];
n=Integer.parseInt(b.readLine());
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
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(d[j]>d[i]&&e[j]==e[i])
w++;
if(d[j]<d[i]&&e[j]==e[i])
x++;
if(d[j]==d[i]&&e[j]>e[i])
y++;
if(d[j]==d[i]&&e[j]<e[i])
z++;
}
if(w>0&&x>0&&y>0&&z>0)
t++;
w=0;
x=0;
y=0;
z=0;
}
System.out.print(t);
}
}