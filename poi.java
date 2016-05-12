import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,m=0,a=0,x=0,k=1;
double t=0;
n=Integer.parseInt(b.readLine());
String s;
int d[][]=new int[n][n];
for(i=0;i<n;i++)
d[i][0]=0;
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
x=Integer.parseInt(c.nextToken());
y=Integer.parseInt(c.nextToken());
if(m==1)
{
