import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,f=0,m=0,i=0;
m=Integer.parseInt(b.readLine());
System.out.print("2 3");
for(i=5;i<=m;i++)
{
for(j=2;j<=i/2;j++)
{
if(i%j==0)
{
f=1;
break;
}
}
if(f==0)
System.out.print(" "+i);
f=0;
}
}
}