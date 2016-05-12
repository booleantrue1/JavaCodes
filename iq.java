import java.io.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,m=1,n=0,i=0;
n=Integer.parseInt(b.readLine());
for(i=1;i<n;i++)
{
m=m+i;
t=m%n;
if(t==0)
System.out.print(n+" ");
else
System.out.print(t+" ");
}
}
}