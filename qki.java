import java.io.*;
import java.text.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0;
double add=0.1;
long ans=0;
final double PI=3.14159265358979323;
final double E=2.71828182845904523536;
double p=0,x=0,t=0;
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
x=Double.parseDouble(b.readLine());
long low=1;
long high=1000000000;
while(low<=high)
{
long mid=(low+high)/2;
p=mid;
t=((Math.log(2*PI*p)/2.0+p*(Math.log(p)-Math.log(E)))/Math.log(10.0))+1;
if((long)(t+add)==x)
ans=mid;
if((long)(t+add)<=x)
low=mid+1;
else
high=mid-1;
}
System.out.println(ans);
}
}
}