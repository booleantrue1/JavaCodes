import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,max=-1,p=0,c2=0,c1=0;
n=Integer.parseInt(b.readLine());
StringTokenizer c=new StringTokenizer(b.readLine());
int nos[]=new int[n];
for(i=0;i<n;i++)
{
nos[i]=Integer.parseInt(c.nextToken());
if(nos[i]==0)
c1++;
else
c2++;
}
if(c1==0)
{
System.out.print("-1");
System.exit(0);
}
String s="555555555";
p=c2/9;
for(i=0;i<p;i++)
System.out.print(s);
if(c2<9)
{
System.out.print("0");
System.exit(0);
}
for(i=0;i<c1;i++)
System.out.print("0");
}
}