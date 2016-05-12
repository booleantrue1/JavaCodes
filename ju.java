import java.io.*;
class m
{
static void f2()
{
System.out.print("hello");
}
}
class j
{
static void f()
{
System.out.print("gjkt");
}
public static void main(String aa[])
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.print("Enter two nos.");
f();
m obj=new m();
obj.f2();
/*m=Integer.parseInt(b.readLine());
n=Integer.parseInt(b.readLine());
*/}
catch(Exception e)
{
System.out.print("Kindly enter an integer value for n\n");
System.out.println(e);
System.out.println(e.getMessage());
}
finally
{
//System.out.println(m+n);
}
}
}