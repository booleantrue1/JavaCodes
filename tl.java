import java.io.*;
class x
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,i=0,k=0;
k=Integer.parseInt(b.readLine());
int d[]=new int[k];
for(i=0;i<k;i++)
{
m=Integer.parseInt(b.readLine());
if(m%2==0)
d[i]=m;
else
d[i]=m-1;
}
for(i=0;i<k;i++)
System.out.print(d[i]);
}
}