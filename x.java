import java.io.*;
class x
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String c[]=new String[10];
int i,j,r=0,d=0;
for(i=0;i<5;i++)
{
c[i]=b.readLine();
for(j=0;j<9;j++)
{
if(c[i].charAt(j)=='1')
{
r=i+1;
d=j/2+1;
}
}
}
System.out.println((int)Math.abs(r-3)+Math.abs(d-3));
}
}