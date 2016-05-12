import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,j=0;
m=Integer.parseInt(b.readLine());
System.out.print(m+" ");
while(m!=1)
{
for(j=m-1;j>0;j--)
{
if(m%j==0)
{
System.out.print(j+" ");
break;
}
}
m=j;
}
}
}