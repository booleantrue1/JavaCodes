import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,j=0,n=0,k=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
char d[][]=new char[m+2][n+2];
for(i=0;i<n+2;i++)
{
d[0][i]='.';
d[m+1][i]='.';
}
for(i=0;i<m+2;i++)
{
d[i][0]='.';
d[i][n+1]='.';
}
for(i=1;i<=m;i++)
{
s=b.readLine();
for(j=1;j<=n;j++)
{
d[i][j]=s.charAt(j-1);
}
}
for(i=1;i<=m;i++)
{
for(j=1;j<=n;j++)
{
if((d[i][j]=='W')&&(d[i][j-1]=='P'||d[i][j+1]=='P'||d[i-1][j]=='P'||d[i+1][j]=='P'))
k++;
}
}
System.out.print(k);
}
}