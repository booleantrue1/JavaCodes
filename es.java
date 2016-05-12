import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0;
m=Integer.parseInt(b.readLine());
if(m%10==0)
System.out.print("2");
else
System.out.print("1\n"+(m%10));
}
}