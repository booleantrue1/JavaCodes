import java.io.*;
class y
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String c[]=new String[5];
int i,j,r=0,d=0;
System.out.println("ENTER THE 5X5 MATRIX");
for(i=0;i<5;i++)
{
c[i]=b.readLine();
for(j=0;j<5;j++)
{
if(c[i].charAt(j)=='1')
{
r=i+1;
d=j+1;
}
}
}
System.out.println((int)Math.abs(r-3)+Math.abs(d-3));
}
}