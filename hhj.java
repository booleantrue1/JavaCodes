import java.io.*;
import java.util.*;
class j
{
static int check(int x,int y,int z)
{
int k=0;
if(x%3==0)
k++;
if(y%3==0)
k++;
if(z%3==0)
k++;
return(k);
}
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int l=0,n=0,m=0,p=0,t=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
if(m!=0&&n!=0&&p!=0)
{
t=check(n,m,p);
if(t==1)
{
if(n%3==2)
l++;
if(m%3==2)
l++;
if(p%3==2)
l++;
if(l==2)
System.out.print(n/3+m/3+p/3+1);
else
System.out.print(n/3+m/3+p/3);
System.exit(0);
}
t=(int)Math.min(Math.min(n%3,m%3),p%3);
System.out.print(n/3+m/3+p/3+t);
}
else
System.out.print(n/3+m/3+p/3);
}
}