import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,n=0,k=0,v=0,w=0,t=0,i=0,m=0;
String s,u="\0";
String p[];
int d[][];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
d=new int[m][n];