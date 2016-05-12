import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,i=0,g=0,x=0,y=0,z=0;
String s;
p=Integer.parseInt(b.readLine());
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=1;i<=p;i++)
{
if(i%3==1)
x+=Integer.parseInt(c.nextToken());
if(i%3==2)
y+=Integer.parseInt(c.nextToken());
if(i%3==0)
z+=Integer.parseInt(c.nextToken());
}
g=(x>y)?((x>z)?x:z):((y>z)?y:z);
if(g==x)
System.out.print("chest");
if(g==y)
System.out.print("biceps");
if(g==z)
System.out.print("back");
}
}