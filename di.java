import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int max=-1,i=0,p=0,k=0,t=0;
k=Integer.parseInt(b.readLine());
while(k!=0)
{
t=k;
while(t!=0)
{
p=t%10;
t=t/10;
if(p>max)
max=p;
}
k-=max;
max=-1;
i++;
}
System.out.print(i);
}
}