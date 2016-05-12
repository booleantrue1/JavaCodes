import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int g=0,p=0,w=0,m=0,n=0,i=0,j=0,k=0,t=0;
String s;
int d[];
n=Integer.parseInt(b.readLine());
d=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
g=c.countTokens();
for(i=0;i<g;i++)
d[i]=Integer.parseInt(c.nextToken());