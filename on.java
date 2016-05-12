import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0;
String s,r="\0";
s=b.readLine();
n=Integer.parseInt(s);
for(i=0;;i++)
{
n++;
r=String.valueOf(n);
if(r.charAt(0)!=r.charAt(1)&&r.charAt(0)!=r.charAt(2)&&r.charAt(0)!=r.charAt(3)&&r.charAt(1)!=r.charAt(2)&&r.charAt(1)!=r.charAt(3)&&r.charAt(2)!=r.charAt(3))
break;
}
System.out.print(r);
}
}