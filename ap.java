import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,n=0;
double p=0;
double d[]=new double[525];
int e[]=new int[525];
for(i=0;;i++)
{
d[i]=Double.parseDouble(b.readLine());
if(d[i]==0.00)
break;
else
{
for(n=2;;n++)
{
p+=(double)1/n;
if(p>=d[i])
{
e[i]=n-1;
break;
}
}
p=0;
}
}
for(j=0;j<i;j++)
System.out.println(e[j]+" card(s)");
}
}