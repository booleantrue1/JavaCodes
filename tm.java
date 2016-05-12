import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
double n;
int i;
long m;
m=Long.parseLong(b.readLine());
if(m<2)
System.out.print("NIE");
else
{
for(i=1;i<=50;i++)
if(Math.pow(2,i)==m)
{
System.out.print("TAK");
System.exit(0);
}
System.out.print("NIE");
System.exit(0);
}
}
}