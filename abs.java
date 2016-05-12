import java.io.*;
import java.util.*;
class A 
{
static boolean checkpalin(int n)
{
int t,p=0;
t=n;
while(n!=0)
{
p*=10;
p+=n%10;
n/=10;
}
if(p==t)
return true;
else
return false;
}
public static void main(String[] args) throws IOException 
{
BufferedReader in=new BufferedReader(new FileReader("C-small-practice.in"));
PrintWriter out=new PrintWriter("C-small-practice.out");
int test=Integer.parseInt(in.readLine());
int i,j;
String s;
for(i=1;i<=test;i++)
{
s=in.readLine();
StringTokenizer c=new StringTokenizer(s);
int a=Integer.parseInt(c.nextToken());
int b=Integer.parseInt(c.nextToken());
int count=0;
for(j=a;j<=b;j++)
{
int temp=(int)Math.sqrt(j);
if(Math.sqrt(j)==temp)
{
if(checkpalin(j)&&checkpalin(temp))
count++;
}
}
out.print("Case #"+i+": ");
out.println(count);
}
out.close();
}
}