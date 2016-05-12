import java.io.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,count=0,i=0;
String r,s;
m=Integer.parseInt(b.readLine());
r=b.readLine();
for(i=1;i<m;i++)
{
s=b.readLine();
if(r.compareTo(s)!=0)
count++;
r=s;
}
System.out.print(count+1);
}
}