import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,t=0,n=0;
String s;
t=Integer.parseInt(b.readLine());
int d[]=new int[1000005];
d[0]=0;
d[1]=0;
for(i=2;i<=1000000;i++)
{
for(j=1;j<=i/2;j++)
if(i%j==0)
d[i]+=j;
d[i]+=d[i-1];
}
for(i=0;i<t;i++)
{
n=Integer.parseInt(b.readLine());
System.out.println(d[n]);
}
}
}


77 6
67 74 65 72 63 70 5
11 66 75 22 51 60 44 53 62 71 55 64 73 4
54 43 10 52 61 30 32 41 50 3
31 33 20 40 42 2
21 1