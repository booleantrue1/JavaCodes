import java.io.*;
class j
{
public static void main(String aa[])
{
try
{
StringBuffer obj=new StringBuffer("mahesh");
System.out.println(obj.charAt(2));
System.out.println(obj.substring(2));
System.out.println(obj.equals("mahi"));
obj.setCharAt(2,'j');
System.out.println(obj);
System.out.println(obj.insert(3,"fty"));
System.out.println(obj.append("mishra"));
System.out.println(obj);
}
catch(Exception e){}
}
}
//StringBuffer class can use charAt,equals,substring "only" ,as methods from String class.