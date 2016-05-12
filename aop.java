import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i;
int counter=0;
int arr[]=new int[110];
arr[0]=0;
arr[1]=1;
for(i=2;i<100;i++)
{
int n=i;
while(n!=1&&n!=89)
{
int p=n;
n=0;
while(p!=0)
{
n+=(p%10)*(p%10);
p/=10;
}
}
arr[i]=n;
}
for(i=1;i<10000000;i++)
{
int p=i;
int ans=0;
while(p!=0)
{
ans+=(p%10)*(p%10);
p/=10;
}
while(ans>99)
{
p=ans;
ans=0;
while(p!=0)
{
ans+=(p%10)*(p%10);
p/=10;
}
}
if(arr[ans]==89)
counter++;
}
System.out.print(counter);
}
}