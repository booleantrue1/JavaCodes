import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=1,m=0,p=0,n=0,i=0;
m=Integer.parseInt(b.readLine());
System.out.print("0 1");
for(i=2;i<m;i++)
{
p=n+k;
System.out.print(" "+p);
n=k;
k=p;
}
}
}