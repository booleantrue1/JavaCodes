import java.io.*;
import java.util.*;
import java.math.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    int n,k,maxm,t,j,i,p;
    t=Integer.parseInt(b.readLine());
    String s,s1,s2,s3;
    for(i=0;i<t;i++)
    {
        s=b.readLine();
		StringTokenizer c=new StringTokenizer(s);
		s1=c.nextToken();
		s2=c.nextToken();
		s3=c.nextToken();
		BigDecimal b1=new BigDecimal(s1);
		BigDecimal b2=new BigDecimal(s2);
		BigDecimal b3=new BigDecimal(s3);
		BigDecimal b4=new BigDecimal("2");
		BigDecimal b5=b2.add(b4.multiply(b3));
		BigDecimal b6=b1.multiply(b4.multiply(b3));
		BigDecimal b7=b2.multiply(b4.multiply(b4));
		BigDecimal b8=(b7.multiply(b7)).add(((b4.multiply(b4)).multiply(b6)).multiply(b7));
		BigDecimal b9=b8.root(2);
		BigDecimal b10=new BigDecimal("-1");
		BigDecimal b11=b6.multiply(b10);
		BigDecimal b12=b11.add(b9);
		BigDecimal b13=b11.subtract(b9);
		BigDecimal b14=b12.divide(b4.multiply(b5));
		BigDecimal b15=b13.divide(b4.multiply(b5));
		BigInteger b16=b14.toBigInteger();
	}
	}
	}