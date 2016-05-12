import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,l=0,m=0,n=0,i=0;
String s;
String d[]=new String[8];
s=b.readLine()+b.readLine()+b.readLine();
d[0]=s.substring(0,3);
d[1]=s.substring(3,6);
d[2]=s.substring(6,9);
d[3]=(s.substring(0,1)+s.substring(3,4)+s.substring(6,7));
d[4]=(s.substring(1,2)+s.substring(4,5)+s.substring(7,8));
d[5]=(s.substring(2,3)+s.substring(5,6)+s.substring(8,9));
d[6]=(s.substring(0,1)+s.substring(4,5)+s.substring(8,9));
d[7]=(s.substring(2,3)+s.substring(4,5)+s.substring(6,7));
for(i=0;i<8;i++)
{
if(d[i].compareTo("XXX")==0)
k++;
if(d[i].compareTo("000")==0)
l++;
}
if(s.indexOf('.')>=0)
{
for(i=0;i<9;i++)
{
if(s.charAt(i)=='X')
m++;
if(s.charAt(i)=='0')
n++;
}
if((n>m)||(m-n)>1||(k==1&&l==1))
{
System.out.print("illegal");
System.exit(0);
}
else
{
if(k==1)
{
if(m-n==1)
{
System.out.print("the first player won");
System.exit(0);
}
else
{
System.out.print("illegal");
System.exit(0);
}
}
else
{
if(l==1)
{
if(m==n)
{
System.out.print("the second player won");
System.exit(0);
}
else
{
System.out.print("illegal");
System.exit(0);
}
}
else
{
if(m>n)
{
System.out.print("second");
System.exit(0);
}
else
{
System.out.print("first");
System.exit(0);
}
}
}
}
}
else
{
for(i=0;i<9;i++)
{
if(s.charAt(i)=='X')
m++;
}
if(m!=5||(k==1&&l==1))
{
System.out.print("illegal");
System.exit(0);
}
else
{
if(k==0&&l==0)
{
System.out.print("draw");
System.exit(0);
}
if(k==1||(l==0&&k==2))
{
System.out.print("the first player won");
System.exit(0);
}
if(l==1||(k==0&&l==2))
{
System.out.print("the second player won");
System.exit(0);
}
}
}
}
}