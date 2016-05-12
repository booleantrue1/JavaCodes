import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,l=0,m=0,i=0,f=0,n=0;
n=Integer.parseInt(b.readLine());
String t=b.readLine();
StringTokenizer c=new StringTokenizer(t);
for(i=0;i<n;i++)
{
f=Integer.parseInt(c.nextToken());