import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0;
String s=b.readLine();
n=Integer.parseInt(b.readLine());
String d[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
for(i=0;i<12;i++)
{
if(d[i].equals(s))
{
System.out.print(d[((n%12)+i)%12]);
System.exit(0);
}
}
}
}