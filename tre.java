import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
int k=0,p=0,t=0,n=0,i=0,j=0;
n=Integer.parseInt(b.readLine());
String s="\0",r="\0";
int d[]=new int[512];
for(i=1;i<=512;i++)
{
k=i;
while(k/2!=0)
{
s+=String.valueOf(k%2);
k=k/2;
}
s+="1";
s=s.trim();
t=s.length();
for(j=t-1;j>=0;j--)
r+=s.substring(j,j+1);
d[i-1]=Integer.parseInt(r.trim());
s="\0";
r="\0";
}
p=Arrays.binarySearch(d,n);
if(p<0)
{
p=p*(-1);
p--;
}
else
p++;
System.out.print(p);
}
}