import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,pro=0;
int d[]=new int[4];
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<4;i++)
d[i]=Integer.parseInt(c.nextToken());
s=b.readLine();
for(i=0;i<5;i+=2)
if(s.charAt(i)=='*')
pro++;
if(pro==0)
System.out.print(d[0]+d[1]+d[2]+d[3]);
if(pro==3)
System.out.print((long)d[0]*d[1]*d[2]*d[3]);
if(pro==1)
{
Arrays.sort(d);
if(Arrays.binarySearch(d,0)>=0)
System.out.print("0");
else
System.out.print(d[0]*d[1]+d[2]+d[3]);
}
if(pro==2)
{
Arrays.sort(d);
d[0]=d[0]*d[1];
d[1]=d[2];
d[2]=d[3];
d[3]=-1;
Arrays.sort(d);
System.out.print(d[1]*d[2]+d[3]);
}
}
}