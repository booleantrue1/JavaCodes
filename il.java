import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
long p=0;
int t=0,i=0,j=0,k=0;
k=Integer.parseInt(b.readLine());
int d[]=new int[k];
String s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<12;i++)
if(Math.pow(4,i)==k)
{
t=i+1;
break;
}
for(i=0;i<k;i++)
d[i]=Integer.parseInt(c.nextToken());
Arrays.sort(d);
for(i=k-1;i>=0;i--)
{
if(k-1-i==Math.pow(4,j))
{
j++;
t--;
}
p+=(long)t*d[i];
}
System.out.print(p);
}
}