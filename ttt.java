import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,t=0;
int d[];
n=Integer.parseInt(b.readLine());
d=new int[n];
for(i=0;i<n;i++)
d[i]=Integer.parseInt(b.readLine());
t=d[0]+1;
for(i=1;i<n;i++)
{
if(d[i]<d[i-1])
t+=(d[i-1]-d[i]+1+1);
else
t+=(1+d[i]-d[i-1]+1);
}
System.out.print(t);
}
}