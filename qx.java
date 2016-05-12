import java.io.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0;
n=Integer.parseInt(b.readLine());
if(n==1)
{
System.out.print("1");
System.exit(0);
}
else
{
System.out.print(n+" ");
for(i=1;i<n;i++)
System.out.print(i+" ");
}
}
}