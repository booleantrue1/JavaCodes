import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0;
n=Integer.parseInt(b.readLine());
if(n==1)
System.out.print("1");
if(n==3)
System.out.print("3"+" "+"1"+" "+"2")
if(n!=1&&n!=3)
{
for(i=2;i<=n;i++)
System.out.print(i+" ");
System.out.print("1");
}
}
}