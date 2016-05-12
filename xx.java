import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,n=0,i=0;
n=Integer.parseInt(b.readLine());
k+=n+n-1;
for(i=2;i<=n;i++)
{
k+=(i*(n-i));
}
System.out.print(k);
}
}