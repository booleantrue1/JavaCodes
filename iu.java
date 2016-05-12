import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,k=0,n=0,i=0;
String s[];
int d[];
int e[];
n=Integer.parseInt(b.readLine());
s=new String[n];
d=new int[n];
e=new int[n];
for(i=0;i<n;i++)
s[i]=b.readLine();
for(i=0;i<n;i++)
{
StringTokenizer c=new StringTokenizer(s[i]);
d[i]=Integer.parseInt(c.nextToken());
e[i]=Integer.parseInt(c.nextToken());
}