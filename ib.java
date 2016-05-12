import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
long n=0,p=0,i=0;
p=Long.parseLong(b.readLine());
n=p;
while(n>1)
{
for(i=2;i<=n;i++)
{
if(n%i==0)
{
n=n/i;
p+=n;
break;
}
}
}
System.out.print(p);
}
}