import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,k=0,j=0,p=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
x1=Integer.parseInt(c.nextToken());
y1=Integer.parseInt(c.nextToken());
x2=Integer.parseInt(c.nextToken());
y2=Integer.parseInt(c.nextToken());
x3=Integer.parseInt(c.nextToken());
y3=Integer.parseInt(c.nextToken());
int d[]=new int[3];
d[0]=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
d[1]=((x2-x3)*(x2-x3))+((y2-y3)*(y2-y3));
d[2]=((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1));
Arrays.sort(d);
if(d[0]+d[1]==d[2])
{
System.out.print("RIGHT");
System.exit(0);
}

