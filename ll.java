import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,k=0,n=0,i=0;
String s;
char q='\0';
s=b.readLine();
p=s.length();
for(i=0;i<p;i++)
{
q=s.charAt(i);
if(q=='4')
k++;
if(q=='7')
n++;
}
if(k>0||n>0)
{
if(k>=n)
System.out.print("4");
else
System.out.print("7");
}
else
System.out.print("-1");
}
}