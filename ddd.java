import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,t=0,n=0;
int d[];
n=Integer.parseInt(b.readLine());
d=new int[n+1];
for(i=0;i<=n;i++)
d[i]=i;
if(n%2==1)
System.out.print("-1");
else
{
for(i=1;i<=n;i+=2)
{
t=d[i];
d[i]=d[i+1];
d[i+1]=t;
}
for(i=1;i<=n;i++)
System.out.print(d[i]+" ");
}
}
}