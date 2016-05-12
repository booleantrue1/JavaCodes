import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader f = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int count=0,flag=0,i=0,min=1000000,p=0,j=0,k=0;
int d[]=new int[40001];
for(i=0;i<40001;i++)
d[i]=0;
d[0]=1;
d[1]=1;
for(j=2;j<=40000;j++)
{
k=j;
count=0;
if(d[j]!=1)
{
for(i=j;i<=40000;i++)
{
if(i==j)
continue;
if(d[i]==0)
count++;
if(count==k)
{
d[i]=1;
count=0;
}
}
}
}
int val=0;
for(i=0;i<40001;i++)
if(d[i]==0)
{
val++;
out.print(i+",");
}
System.out.print(val);
out.close();
}
}