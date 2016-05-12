import java.io.*;
class h
{
public static void main(String a[])throws IOException
{
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
String s[]={"Sheldon","Leonard","Penny","Rajesh","Howard"};
int n=0,p=5,k=100000000,sum=5,i=0,j;
n=Integer.parseInt(obj.readLine());
if(n<=sum)
System.out.print(s[n-1]);
else
{
for(i=1;sum<n;i*=2)
{
p*=2;
sum+=p;
}
sum-=p;
k=n-sum;
for(j=0;k>0;j++)
k=k-i;
System.out.print(s[j-1]);
}
}
}