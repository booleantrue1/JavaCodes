import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
int t=0,b=0,a=0,i,p1=0,p2=0,p3=0;
String s;
t=Integer.parseInt(bb.readLine());
int d[]={2, 4, 9, 16, 25, 64, 289, 729, 1681, 2401, 3481, 4096, 5041, 7921, 10201, 15625, 17161, 27889, 28561, 29929, 65536, 83521,
85849, 146689, 262144, 279841, 458329, 491401, 531441, 552049, 579121, 597529, 683929, 703921, 707281, 734449, 829921, 1190281};
for(i=0;i<t;i++)
{
s=bb.readLine();
StringTokenizer c=new StringTokenizer(s);
a=Integer.parseInt(c.nextToken());
b=Integer.parseInt(c.nextToken());
p1=Arrays.binarySearch(d,a);
p2=Arrays.binarySearch(d,b);
if(p1<0)
p1=(-1)*p1-1;
if(p2<0)
p3=(-1)*p2-1;
if(p2>=0)
System.out.println(p2-p1+1);
else
System.out.println(p3-p1);
}
}
}
