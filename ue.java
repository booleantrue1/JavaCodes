import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int h=0,j=0,i=0,t=0,p=0;
String s;
int d[];
j=Integer.parseInt(b.readLine());
d=new int[7];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<7;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=0;t<j;p++)
{
t+=d[i];
i++;
if(i==7)
i=0;
}
h=i%7;
if(h==0)
System.out.print("7");
else
System.out.print(h);
}
}