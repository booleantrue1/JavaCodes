import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String s;
int x=0,n=0,j=0,i=0;
int d[];
int e[];
n=Integer.parseInt(b.readLine());
d=new int[n];
e=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
{
d[i]=Integer.parseInt(c.nextToken());
e[i]=0;
}
for(i=0;i<n;i++)
{
if(d[i]<0)
x++;
if(x==3)
{
i--;
j++;
x=0;
continue;
}
e[j]++;
}
System.out.println(j+1);
for(i=0;i<=j;i++)
System.out.print(e[i]+" ");
}
}