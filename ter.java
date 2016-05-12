import java.io.*;
import java.text.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,k=0,j=0;
DecimalFormat f=new DecimalFormat("##.00");
double t=0;
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
k=Integer.parseInt(b.readLine());
for(j=1;j<=k;j++)
t+=1.0/j;
System.out.println(f.format(t*k));
t=0;
}
}
}