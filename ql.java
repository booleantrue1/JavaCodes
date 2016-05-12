import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,m=0,n=0,i=0,k=0;
String s,r="\0";
for(;;)
{
p=Integer.parseInt(b.readLine());
if(p==0)
break;
else
r+=String.valueOf(p*(p+1)*(2*p+1)/6)+"\n";
}
System.out.print(r.trim());
}
}