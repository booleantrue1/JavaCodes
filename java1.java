/*All the UDF and DM made in same class as main function is , have to be static to be able to be called up by main()*/
/*But this is not compulsory if the UDF or DM is in a different class .... they can be in all cases be called up by the object
of that class and if they are static , they can even be called up by the class name...*/
import java.io.*;
import java.util.*;
class m
{
//int p=5;
void f2()
{
System.out.println("world");
}
}
class j
{
int p=0;
void f1()
{
System.out.println("hello");
}
public static void main(String a[])throws IOException
{
//m x=new m();
System.out.print(p);
//j.f1();
}
}