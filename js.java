import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
char d[][]=new char[m+2][n+2];
for(i=0;i<m+2;i++)
for(j=0;j<n+2;j++)
if(i==0||j==0)
d[i][j]='W';
for(i=1;i<m+1;i++)
{
s=b.readLine();
for(j=1;j<n+1;j++)
d[i][j]=s.charAt(j-1);
}
for(i=0;i<m+2;i++)
{
for(j=0;j<n+2;j++)
{
if(d[i][j]=='B')
{