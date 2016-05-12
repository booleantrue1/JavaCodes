import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,p=0,n=0,k=0,t=0;
int d[];
String s;
for(;;)
{
n=Integer.parseInt(b.readLine());
if(n==-1)
System.exit(0);
else
{
d=new int[n];
for(i=0;i<n;i++)
{
d[i]=Integer.parseInt(b.readLine());
p+=d[i];
}
if(p%n!=0)
System.out.println("-1");
else
{
p=p/n;
for(i=0;i<n;i++)
if(d[i]<p)
k+=p-d[i];
System.out.println(k);
}
k=0;
p=0;
}
}
}
}