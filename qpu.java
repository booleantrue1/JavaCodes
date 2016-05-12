import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,i=0,max=-1,p=0,count=1;
String s;
for(i=1;i<1000000;i++)
{
count=1;
j=i;
while(j>1)
{
System.out.println("*");
if(j%2==0)
j=j/2;
else
j=3*j+1;
count++;
}
if(count>max)
{
max=count;
p=i;
}
System.out.println(i+" "+count);
}
System.out.print(p);
}
}