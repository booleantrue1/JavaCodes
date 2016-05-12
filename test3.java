import java.io.*;
import java.math.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
BigDecimal c=new BigDecimal("1");
BigDecimal d=new BigDecimal("10000000000000000000000");
BigDecimal e=c.divide(d);
BigDecimal f=e.add(c);
System.out.print(f);
}
}