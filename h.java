import java.io.*;
public class x
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String s;
int n,i,c=0;
n=Integer.parseInt(b.readLine());
s=b.readLine();
for(i=0;i<n-1;i++)
{
if(s.charAt(i)==s.charAt(i+1))
c++;
}
System.out.print(c);
}
}