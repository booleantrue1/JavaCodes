import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,n=0,k=0,p=0,j=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
int d[][]=new int[m+2][n+2];
int e[]=new int[105];
e[0]=0;
for(i=0;i<m+2;i++)
{
d[i][0]=-1;
d[i][n+1]=-1;
}
for(i=0;i<n+2;i++)
{
d[0][i]=-1;
d[m+1][i]=-1;
}
for(i=1;i<m+1;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(j=1;j<n+1;j++)
d[i][j]=Integer.parseInt(z.nextToken());
}
for(i=1;i<m+1;i++)
{
for(j=1;j<n+1;j++)
{
if(d[i][j]!=-1)
{
if(d[i][j-1]==d[i][j])
k++;
if(d[i][j+1]==d[i][j])
k++;
if(d[i-1][j-1]==d[i][j])
k++;
if(d[i][j+1]==d[i][j])
k++;
if(d[i-1][j]==d[i][j])
k++;
if(d[i+1][j-1]==d[i][j])
k++;
if(d[i+1][j]==d[i][j])
k++;
if(d[i+1][j+1]==d[i][j])
k++;
if(k>0)
e[d[i][j]]++;
}
k=0;
}
}
for(i=0;i<105;i++)
if(e[i]>0)
p++;
System.out.print(p);
}
}