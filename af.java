import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,i=0;
long p=1;
m=Integer.parseInt(b.readLine());
if(m==0||m==1)
System.out.print("1");
else
{
for(i=1;i<m;i++)
{
p=p*3;
if(p>1000003)
p=p%1000003;
}
System.out.print(p);
}
}
}