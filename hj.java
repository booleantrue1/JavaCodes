import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,m=0;
int d[]=new int[501];
d[0]=0;
for(i=1;i<501;i++)
{
Arrays.sort(d);
if(d[i-1]-i>0&&Arrays.binarySearch(d,d[i-1]-i)<0)
d[i]=d[i-1]-i;
else
d[i]=d[i-1]+i;
}
System.out.print(d[1]+" "+d[2]+" "+d[3]+" "+d[4]);
for(;;)
{
n=Integer.parseInt(b.readLine());
if(n==-1)
System.exit(0);
System.out.println(d[n]);
}
}
}