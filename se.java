import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
Scanner b=new Scanner(System.in);
double t=0,p=0,n=0;
while(b.hasNextLine())
{
n=Double.parseDouble(b.nextLine());
t+=n;
if(n!=0)
p++;
}
System.out.print((t-p)/p);
}
}