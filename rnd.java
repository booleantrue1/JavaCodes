/* HOW TO ROUND A NO. OFF TO A CERTAIN NO. OF DIGITS.*/
import java.text.*;
class j
{
public static void main(String args[])
{
double a = 123.1;
DecimalFormat f=new DecimalFormat("##");
System.out.print(f.format(a));
}
}