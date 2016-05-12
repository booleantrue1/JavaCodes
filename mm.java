import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0;
n=Integer.parseInt(b.readLine());
if(n==1||n==2)
System.out.print(-1);
else
for(i=n;i>0;i--)
System.out.print(i+" ");
}
}