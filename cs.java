import java.io.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0;
n=Integer.parseInt(b.readLine());
for(i=1;i<=n/2;i++)
System.out.print(i+" "+(n-i+1)+" ");
if(n%2==1)
System.out.print((n+1)/2);
}
}