import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
double j;
j=Double.parseDouble(b.readLine());
System.out.print(j%3);
}
}