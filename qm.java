import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,m=0,j=0,i=0;
String s;
s=b.readLine();
for(i=0;;i++)
{
m=s.length();
if(m==1)
{
System.out.print(i);
System.exit(0);
}
else
{
for(j=0;j<m;j++)
k+=(Integer.parseInt(s.substring(j,j+1)));
s=String.valueOf(k);
k=0;
}
}
}
}