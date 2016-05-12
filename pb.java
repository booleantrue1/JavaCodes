import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,i=0,j=0,n=0,m=0;
String s,r="\0",t="\0";
char q='\0';
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
t=c.nextToken();
q=t.charAt(0);
char d[][]=new char[m+2][n+2];
for(i=0;i<m+2;i++)
for(j=0;j<n+2;j++)
if(i==0||j==0||i==m+1||j==n+1)
{
d[i][j]='.';
continue;
}
for(i=1;i<m+1;i++)
{
s=b.readLine();
for(j=1;j<n+1;j++)
d[i][j]=s.charAt(j-1);
}
for(i=1;i<m+1;i++)
{
for(j=1;j<n+1;j++)
{
if(d[i][j]==q)
{
if(d[i][j+1]!=q&&d[i][j+1]!='.'&&r.indexOf(d[i][j+1])<0)
{
k++;
r+=d[i][j+1];
}
if(d[i][j-1]!=q&&d[i][j-1]!='.'&&r.indexOf(d[i][j-1])<0)
{
k++;
r+=d[i][j-1];
}
if(d[i+1][j]!=q&&d[i+1][j]!='.'&&r.indexOf(d[i+1][j])<0)
{
k++;
r+=d[i+1][j];
}
if(d[i-1][j]!=q&&d[i-1][j]!='.'&&r.indexOf(d[i-1][j])<0)
{
k++;
r+=d[i-1][j];
}
}
}
}
System.out.print(k);
}
}