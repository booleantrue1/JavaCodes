class j
{
final int a=5;
final void f()
{
System.out.print("hello");
}
}
class m extends j
{
void f()
{
super.f();
}
public static void main(String aa[])
{
m ob=new m();
ob.g();
}
}
//Hence final instance variables and instance methods can be inherited but can not be overridden.