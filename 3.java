import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0;
double d=0;
String s="\0";
for(;;)
{
m=Integer.parseInt(b.readLine());
if(m==-1)
{
System.out.print(s.trim());
System.exit(0);
}
else
{
d=(m-1)/3.0;
d=(((Math.sqrt(4*d+1))-1)/2);
if(d==(int)d)
s+="Y"+"\n";
else
s+="N"+"\n";
}
}
}
}