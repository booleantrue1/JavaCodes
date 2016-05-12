import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b = new BufferedReader(new FileReader("input.txt"));
int i;
double sum=0,sum1=0,mean,p,sd;
String r;
double marks[]=new double[100];
for(i=0;i<83;i++)
marks[i]=Double.parseDouble(b.readLine());
for(i=0;i<83;i++)
sum+=marks[i];
mean=sum/83;
for(i=0;i<83;i++)
sum1+=(marks[i]-mean)*(marks[i]-mean);
sd=Math.sqrt(sum1/83);
System.out.print(mean+" "+sd);
}
}