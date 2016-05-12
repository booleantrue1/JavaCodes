import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
Scanner b=new Scanner(System.in);
int j=0;
String s="\0";
int m[]=new int[2];
while(b.hasNextLine())
{
s=b.nextLine();
m[j]=Integer.parseInt(s);
if(j==0)
{
if(m[j]!=42)
System.out.println(m[j]);
else
j=1;
}
}
}
} 