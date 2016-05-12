import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,k=0,j=0,p=0,i=0;
String s;
s=b.readLine();
m=s.length();
for(i=97;i<123;i++)
{
for(j=0;j<m;j++)
if((char)i==s.charAt(j))
p++;
if(p%2==1)
k++;
p=0;
}
if(k%2==0&&k!=0)
System.out.print("Second");
else
System.out.print("First");
}
}