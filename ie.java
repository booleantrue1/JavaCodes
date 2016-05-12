import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,n=0,j=0;
String s;
s=b.readLine();
n=Integer.parseInt(s.substring(0,1));
k=Integer.parseInt(s.substring(2));
j=(n>k)?n:k;
if(j==1)
System.out.print("1/1");
if(j==2)
System.out.print("5/6");
if(j==3)
System.out.print("2/3");
if(j==4)
System.out.print("1/2");
if(j==5)
System.out.print("1/3");
if(j==6)
System.out.print("1/6");
}
}