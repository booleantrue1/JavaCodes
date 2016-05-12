import java.io.*;
class x
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0;
p=Integer.parseInt(b.readLine());
if(p<=2)
System.out.print("NO");
else
if(p%2==0)
System.out.print("YES");
else
System.out.print("NO");
}
}