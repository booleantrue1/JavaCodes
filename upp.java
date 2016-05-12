import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0;
n=Integer.parseInt(b.readLine());
System.out.print(n+" ");
for(i=n/2;i>0;i--)
if(n%i==0)
System.out.print(i+" ");
}
}