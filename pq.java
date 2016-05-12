import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,n=0,j=0,k=0,i=0;
int d[]=new int[4];
int e[]=new int[4];
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
char q[][]=new char[m][n];
String r[]=new String[m];
for(i=0;i<m;i++)
r[i]=b.readLine();
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
q[i][j]=r[i].charAt(j);
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(q[i][j]=='*')
{
d[k]=i+1;
e[k]=j+1;
k++;
}
}
}
if(d[0]==d[1])
d[3]=d[2];
if(d[1]==d[2])
d[3]=d[0];
if(d[0]==d[2])
d[3]=d[1];
if(e[0]==e[1])
e[3]=e[2];
if(e[0]==e[2])
e[3]=e[1];
if(e[1]==e[2])
e[3]=e[0];
System.out.print(d[3]+" "+e[3]);
}
}