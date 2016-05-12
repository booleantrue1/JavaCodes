import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,k=1,i=0,j=0,f=0;
int d[];
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=c.countTokens();
d=new int[m];
for(i=0;i<m;i++)
d[i]=Integer.parseInt(c.nextToken());
for(j=1;j<m;j++)
{
for(i=0;i<=j-1;i++)
{
if(d[j]==d[i])
{
f=1;
break;
}
}
if(f==0)
k++;
f=0;
}
System.out.print(4-k);
}
}