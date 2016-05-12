import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,f=0,j=0,k=0;
for(i=2;;i++)
{
for(j=2;j<=Math.sqrt(i);j++)
{
if(i%j==0)
{
f=1;
break;
}
}
if(f==0)
k++;
f=0;
if(k==100000)
{
System.out.print(i);
break;
}
}
}
}