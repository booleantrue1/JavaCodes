interface j
{
int p=5;
void f();
}
class h implements j
{
public void f()
{
System.out.print("hello world!");
}
}
class m
{
public static void main(String a[])
{
h obj=new h();
obj.f();
j obj1;
obj1=obj;
obj1.f();
}
}