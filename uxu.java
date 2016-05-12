import java.io.*;
import java.util.*;
class j
{
static double frp(long B,long C)
{
return (((-1)*B+Math.sqrt(B*B+4*C))/2);
}
static double frn(long B,long C)
{
return (((-1)*B-Math.sqrt(B*B+4*C))/2);
}
static int digcheck(double p)
{
long q=(long)p;
int sum=0;
while(q>0)
{
sum+=q%10;
q=q/10;
}
return sum;
}
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
long root3=-1,root4=-1,flag=0,k=0,m=0,n=0,i=0;
double root1=0,root2=0;
String s;
n=Long.parseLong(b.readLine());
for(i=1;i<=81;i++)
{
root1=frp(i,n);
root2=frn(i,n);
//
if(root1>0&&root1==(long)root1&&digcheck(root1)==i&&(long)root1*(long)root1+i*(long)root1==n)
{
root3=(long)root1;
flag=1;
}
if(root2>0&&root2==(long)root2&&digcheck(root2)==i&&(long)root2*(long)root2+i*(long)root2==n)
{
root4=(long)root2;
flag=1;
}
if(flag==1)
break;
}
if(root3==-1&&root4==-1)
System.out.print("-1");
else
{
if(root3==-1)
System.out.print(root4);
else
{
if(root4==-1)
System.out.print(root3);
else
System.out.print((long)Math.min(root4,root3));
}
}
}
}