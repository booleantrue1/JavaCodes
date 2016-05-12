import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int h=0,g=0,j=0,i=0,p=0,q=0,u=0,v=0,x=0,k=0;
k=Integer.parseInt(b.readLine());
double d[]=new double[100];
double e[]=new double[k];
for(i=0;i<100;i++)
d[i]=i+1;
for(i=1;i<100;i++)
d[i]=d[i]*d[i-1];
for(i=0;i<k;i++)
{
p=Integer.parseInt(b.readLine());
e[i]=d[p-1];
}
for(i=0;i<k;i++)
System.out.println((long)e[i]);
}
}