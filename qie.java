import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,c1=0,c2=0,c3=0,c4=0,flag1=0,flag2=0,sum1=0,sum2=0,sum3=0,m=0;
String s;
StringTokenizer x=new StringTokenizer(b.readLine());
c1=Integer.parseInt(x.nextToken());
c2=Integer.parseInt(x.nextToken());
if(c2==0&&c1==1)
System.out.print("0");
else
{
if(c2==0&&c1>1)
System.out.print("No solution");
else
{
System.out.print(c2);
for(i=0;i<c1-1;i++)
System.out.print("0");
}
}
}
}