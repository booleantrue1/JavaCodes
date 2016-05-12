import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,p=0,k=0,q=0,l=0;
String s,r="\0";
m=Integer.parseInt(b.readLine());
int d[]=new int[m];
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
for(i=0;i<m;i++)
{
d[i]=Integer.parseInt(y.nextToken());
if(d[i]/10==0&&d[i]%10!=0)
l++;
}
for(i=0;i<m;i++)
{
if(d[i]==100||d[i]==0)
{
k++;
r+=d[i]+" ";
continue;
}
if(d[i]/10==0&&d[i]%10!=0&&p==0)
{
p++;
k++;
r+=d[i]+" ";
continue;
}
if(l!=0)
{
if(d[i]%10==0&&q==0)
{
q++;
k++;
r+=d[i]+" ";
}
}
else
{
if(d[i]!=0&&q==0)
{
q++;
k++;
r+=d[i]+" ";
}
}
}
System.out.println(k);
System.out.println(r.trim());
}
}