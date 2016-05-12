import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m1,m2,m3,m4,m5,m6,n1,n2,n3,n4,n5,n6;
String s;
s=b.readLine();
StringTokenizer u=new StringTokenizer(s);
m1=Integer.parseInt(u.nextToken());
n1=Integer.parseInt(u.nextToken());
s=b.readLine();
StringTokenizer v=new StringTokenizer(s);
m2=Integer.parseInt(v.nextToken());
n2=Integer.parseInt(v.nextToken());
s=b.readLine();
StringTokenizer w=new StringTokenizer(s);
m3=Integer.parseInt(w.nextToken());
n3=Integer.parseInt(w.nextToken());
s=b.readLine();
StringTokenizer x=new StringTokenizer(s);
m4=Integer.parseInt(x.nextToken());
n4=Integer.parseInt(x.nextToken());
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
m5=Integer.parseInt(y.nextToken());
n5=Integer.parseInt(y.nextToken());
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
m6=Integer.parseInt(z.nextToken());
n6=Integer.parseInt(z.nextToken());
double d[]=new double[3];
double e[]=new double[3];
d[0]=Math.sqrt(((m1-m2)*(m1-m2))+((n1-n2)*(n1-n2)));
d[1]=Math.sqrt(((m1-m3)*(m1-m3))+((n1-n3)*(n1-n3)));
d[2]=Math.sqrt(((m3-m2)*(m3-m2))+((n3-n2)*(n3-n2)));
e[0]=Math.sqrt(((m4-m5)*(m4-m5))+((n4-n5)*(n4-n5)));
e[1]=Math.sqrt(((m4-m6)*(m4-m6))+((n4-n6)*(n4-n6)));
e[2]=Math.sqrt(((m5-m6)*(m5-m6))+((n5-n6)*(n5-n6)));
Arrays.sort(d);
Arrays.sort(e);
if(d[0]/e[0]==d[1]/e[1]&&d[1]/e[1]==d[2]/e[2])
System.out.print("YES");
else
System.out.print("NO");
}
}