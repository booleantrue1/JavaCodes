import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader f = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
//long f[]=new long[1000000];
int k=0;
long i,j;
double p;
for(i=1;i<=100000;i++)
for(j=1;j<=100000;j++)
{
p=Math.sqrt(i*i+j*j);
if(p==(long)p)
{
out.println((long)p);
}
}
out.close();
}
}