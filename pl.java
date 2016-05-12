import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,p=0;
long k=0,max=-1;
String s;
m=Integer.parseInt(b.readLine());
int d[]=new int[m];
int e[]=new int[m];
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
d[i]=Integer.parseInt(y.nextToken());
e[i]=Integer.parseInt(y.nextToken());
}
for(i=1;;i++)
{
p=Arrays.binarySearch(d,i);
if(p>=0)
{
if(k==0)
{
k+=e[p];
if(k>max)
max=k;
continue;
}
else
k+=e[p];
}
if(k!=0)
k--;
if(k>max)
max=k;
if(i>d[m-1])
break;
}
System.out.print(i+k+" "+max);
}
}