import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int h=0,g=1,t=0,j=0,n=0,i=0;
String s;
n=Integer.parseInt(b.readLine());
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
StringTokenizer d=new StringTokenizer(s);
t=Integer.parseInt(c.nextToken());
for(i=1;i<n;i++)
{
j=Integer.parseInt(c.nextToken());
if(j<t)
{
t=j;
g=i+1;
}
}
for(i=0;i<n;i++)
{
if(Integer.parseInt(d.nextToken())==t)
{
h++;
if(h==2)
{
System.out.print("Still Rozdil");
break;
}
}
}
if(h!=2)
System.out.print(g);
}
}