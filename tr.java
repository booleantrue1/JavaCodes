import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int x=0,m=0,i=0,f=0,k=2,n=0;
double p=0;
m=Integer.parseInt(b.readLine());
n=Integer.parseInt(b.readLine());
for(i=0;k>1;i++)
{
p=(double)n/m;
k=(int)p;
if(p==k)
{
n=k;
x++;
}
else
{
f=1;
break;
}
}
if(f==1)
System.out.print("NO");
else
System.out.print("YES\n"+(x-1));
}
}