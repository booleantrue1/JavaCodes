import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0;
DecimalFormat f=new DecimalFormat(".0000000000000000000000000000");
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
BigDecimal d=new BigDecimal(c.nextToken());
BigDecimal e=new BigDecimal(c.nextToken());
BigDecimal w=new BigDecimal(f.format(d.divide(e)));
m=Integer.parseInt(b.readLine());
String r[]=new String[m];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=m-1;i>=0;i--)
r[i]=z.nextToken();
BigDecimal p=new BigDecimal("1");
BigDecimal u=new BigDecimal(r[0]);
for(i=1;i<m;i++)
{
BigDecimal v=new BigDecimal(r[i]);
BigDecimal t=new BigDecimal(f.format(p.divide(u)));
u=t.add(v);
}
if(u.compareTo(w)==0)
System.out.print("YES");
else
System.out.print("NO");
}
}