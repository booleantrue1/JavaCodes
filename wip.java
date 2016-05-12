import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,t=0,n=0;
double p=0,q=0,ans=0;
t=Integer.parseInt(b.readLine());
for(i=0;i<t;i++)
{
n=Integer.parseInt(b.readLine());
ans=0.6079271018540266286632*((double)n);
p=Math.ceil(ans);
q=Math.floor(ans);
if(p-ans>ans-q)
System.out.println((long)q);
else
System.out.println((long)p);
}
}
}