import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,p=0,j=0,z=0,k=0,counter=0,flag=0,n=0,m=0;
String s,q="\0";
String r[]=new String[10005];
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
counter=0;
k=0;
flag=0;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
p=c.countTokens();
StringTokenizer x=new StringTokenizer(s);
for(z=0;z<p;z++)
{
q=x.nextToken();
for(j=0;j<k;j++)
if(r[j].compareTo(q)==0)
{
flag=1;
break;
}
if(flag==0)
{
r[k++]=q;
counter++;
}
flag=0;
}
System.out.println(counter);
}
}
}