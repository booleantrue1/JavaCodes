import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0;
String s;
s=b.readLine();
n=s.length();
if(s.endsWith("0"))
{
for(i=n-1;i>=0;i--)
if(s.charAt(i)!='0')
break;
if(i==0)
{
s=String.valueOf((Integer.parseInt(s.substring(i,i+2)))-1);
for(i=0;i<)
else
s=s.substring(0,i)+String.valueOf((Integer.parseInt(s.substring(i,i+1)))-1)+s.substring(i+2);
}
else
s=s.substring(0,n-1)+((char)(s.charAt(n-1)-1));
System.out.print(s);
}
}