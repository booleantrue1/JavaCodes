//to concatenate two file.. more than two files can not be concatenated together like this.
import java.io.*;
class j
{
public static void main(String aa[])
{
try
{
FileInputStream f1=new FileInputStream(new File("exam1.dat"));
FileInputStream f2=new FileInputStream("exam2.dat");
SequenceInputStream f3=new SequenceInputStream(f1,f2);
DataInputStream b=new DataInputStream(f3);
System.out.println(b.readLine());
System.out.print(b.readLine());
}
catch(Exception e)
{
}
}
}