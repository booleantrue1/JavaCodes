import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,k=0,i=0,index=1,t=0,m=0,n=0,flag=0;
String s;
long count=0;
t=Integer.parseInt(b.readLine());
int d[]=new int[t];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<t;i++)
d[i]=Integer.parseInt(c.nextToken());