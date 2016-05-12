myexp extends Exception
{
myexp(String s)
{
super(s);
}
}
class myexp1 extends Exception
{
myexp1(String s)j

jjj

{
super(s);
}
}
class j
{
public static void main(String AA[])
{
String d="dyufgf";
try
{
if(d.startsWith("dy"))
throw new myexp("string starts with dy");
}
catch(myexp e)
{
System.out.println(e.getMessage());
}
try
{
if(d.endsWith("gf"))
throw new myexp1("string ends with gf");
}
catch(myexp1 e)
{
System.out.print(e.getMessage());
}
}
}