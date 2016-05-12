import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i,j,k,n;
StringTokenizer c=new StringTokenizer(b.readLine());
k=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
String r[]=new String[k];
String s;
for(i=0;i<k;i++)
r[i]=b.readLine();
for(i=0;i<n;i++)
{
int flag=0;
s=b.readLine();
if(s.length()>=47)
{
System.out.println("Good");
continue;
}
for(j=0;j<k;j++)
if(s.indexOf(r[j])>=0)
{
flag=1;
break;
}
if(flag==1)
System.out.println("Good");
else
System.out.println("Bad");
}
}
}