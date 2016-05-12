import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
Scanner b=new Scanner(System.in);
String s=b.nextLine();
s=s.replace("--","2");
s=s.replace("-.","1");
s=s.replace(".","0");
System.out.print(s);
}
}