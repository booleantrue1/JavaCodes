import java.io.*;
import java.util.*;
public class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,j=0,m=0,i=0;
m=Integer.parseInt(b.readLine());
int d[]=new int[m];
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=m-1;i>0;i--)
if(d[i]<d[i-1])
break;
System.out.print(i);
}
}