import java.io.*;
class j


{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0;
m=Integer.parseInt(b.readLine());
if(((Math.sqrt(m*8+1)-1)/2)==(int)((Math.sqrt(m*8+1)-1)/2))
System.out.print("YES");
else
System.out.print("NO");
}
}