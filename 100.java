import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int x=0,u=0,p=0,n=0,j=0,m=0,i=0;
String s;
m=Integer.parseInt(b.readLine());
String d[];
int e[];
int f[];
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
d=new String[n];
for(j=0;j<n;j++)
d[i]=b.readLine();
for(u=0;u<n-1;u++)
{
for(j=u+1;j<n;j++)
{
if(d[j].compareTo(d[u])<0)
{t=d[j];d[j]=d[u];d[u]=t;}}}
for(u=0;u<n;u++)
{
if()