import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,max=-1,p=0,c2=0,c1=0;
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
StringTokenizer c=new StringTokenizer(b.readLine());
r=c.nextToken();
s=c.nextToken();
char m=r.charAt(r.length()-1);
char p=s.charAt(s.length()-1);
num=p-'0';
if(s.length()>1)
{
char q=s.charAt(s.length()-2);
num+=10*(q-'0');
}
if(s.equals("0"))
{
System.out.println("1");
}
else
{
if(m=='0'||m=='1'||m=='5'||m=='6')
System.out.println(m);
else
{
if(m=='2')
{
if(num%4==1)
System.out.print("2");
if(num%4==2)
System.out.print("4");
if(num%4==3)
System.out.print("8");
if(num%4==0)
System.out.print("6");
}
if(m=='3')
{
if(num%4==1)
System.out.print("3");
if(num%4==2)
System.out.print("9");
if(num%4==3)
System.out.print("7");
if(num%4==0)
System.out.print("1");
}
if(m=='7')
{
if(num%4==1)
System.out.print("7");
if(num%4==2)
System.out.print("9");
if(num%4==3)
System.out.print("3");
if(num%4==0)
System.out.print("1");
}
if(m=='8')
{
if(num%4==1)
System.out.print("8");
if(num%4==2)
System.out.print("4");
if(num%4==3)
System.out.print("2");
if(num%4==0)
System.out.print("6");
}
if(m=='4')
{
if(num%4==1)
System.out.print("4");
if(num%4==2)
System.out.print("6");
if(num%4==3)
System.out.print("4");
if(num%4==0)
System.out.print("6");
}
if(m=='9')
{
if(num%4==1)
System.out.print("9");
if(num%4==2)
System.out.print("1");
if(num%4==3)
System.out.print("9");
if(num%4==0)
System.out.print("1");
}
}
}
}