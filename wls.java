import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int pres=0,maxm=0,p=0,i=0,n=0,j=0,m=0;
String s;
m=Integer.parseInt(b.readLine());
int d[]=new int[m];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
{
d[i]=Integer.parseInt(z.nextToken());
maxm+=d[i];
}
for(i=1;m/i>2;i++)
{
if(m%i==0)
{
for(j=0;j<i;j++)
{
pres=0;
for(p=j;p<m;p+=i)
pres+=d[p];
maxm=(maxm>pres)?maxm:pres;
}
}
}
System.out.print(maxm);
}
}