import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
Scanner b=new Scanner(System.in);
int i=0,j=0,n=0,f=0,t=0;
String s;
t=b.nextInt();
int d[];
for(i=0;i<t;i++)
{
n=b.nextInt();
d=new int[n];
for(j=0;j<n;j++)
d[j]=b.nextInt();
if(n<4)
{
System.out.println("NO");
continue;
}
Arrays.sort(d);
for(j=0;j<n-2;j++)
if((d[j]==d[j+1])&&(d[j+1]==d[j+2]))
{
System.out.println("NO");
f=1;
break;
}
if(f==0)
System.out.println("YES");
f=0;
}
}
}