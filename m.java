import java.io.*;
class y
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,k=0;
String c,d;
c=b.readLine();
d=b.readLine();
k=d.length();
for(i=0;i<k;i++)
if(d.charAt(i)==c.charAt(j))
j++;
System.out.println(j+1);
}
}