import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,k=0,m=0,n=0;
n=Integer.parseInt(b.readLine());
p=n/36;
n=n%36;
k=n/3;
m=n%3;
if(m==0||m==1)
System.out.print(p+" "+k);
else
{
if(k+1==12)
System.out.print(p+1+" 0");
else
System.out.print(p+" "+(k+1));
}
}
}