import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,i=0,n=0;
String s;
s=b.readLine();
n=s.length();
for(i=0;i<n-1;i++)
{
if(s.charAt(i)==s.charAt(i+1))
{
s=s.substring(0,i)+s.substring(i+2);
n=s.length();
if(i!=0)
i-=2;
else
i--;
}
}
System.out.print(s);
}
}