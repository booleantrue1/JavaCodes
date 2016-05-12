import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,t=0;
String s;
s=b.readLine();
int d[]=new int[4];
StringTokenizer c=new StringTokenizer(s);
d[0]=Integer.parseInt(c.nextToken());
d[1]=Integer.parseInt(c.nextToken());
d[2]=Integer.parseInt(c.nextToken());
d[3]=Integer.parseInt(c.nextToken());
for(i=0;i<3;i++)
for(j=i+1;j<4;j++)
if(d[j]<d[i])
{
t=d[j];
d[j]=d[i];
d[i]=t;
}
if((d[0]+d[1]>d[2])||(d[1]+d[2]>d[3]))
System.out.print("TRIANGLE");
else
{
if((d[0]+d[1]==d[2])||(d[1]+d[2]==d[3]))
System.out.print("SEGMENT");
else
System.out.print("IMPOSSIBLE");
}
}
}