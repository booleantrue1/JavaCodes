import java.io.*;
import java.util.*;
public class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,j=0,n=0,k=0,i=0;
n=Integer.parseInt(b.readLine());
int d[]=new int[n];
String s;
for(j=1;j<n;j++)
{
for(i=1;i<n-1;i++)
{
if((Math.pow(j,i)-1)%n==0)
{
f=1;
break;
}
}
if(f==0&&(Math.pow(j,n-1)-1)%n==0)
k++;
f=0;
}
System.out.print(k);
}
}