import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int v=0,i=0,n=0,j=0,k=0;
String s;
n=Integer.parseInt(b.readLine());
boolean p[]=new boolean[3001];
Arrays.fill(p,true);
p[0]=false;
p[1]=false;
p[2]=true;
p[3]=true;
p[4]=false;
p[5]=true;
p[6]=false;
p[7]=true;
for(i=8;i<3001;i++)
if(i%2==0||i%3==0||i%5==0||i%7==0)
p[i]=false;
for(i=0;i<3001;i++)
{
if(p[i])
{
for(j=2;j<=(int)Math.sqrt(i);j++)
{
if(i%j==0)
{
p[i]=false;
break;
}
}
}
}
for(j=0;j<=n;j++)
{
for(i=0;i<3001;i++)
{
if(p[i]==true&&(j%i)==0)
{
v++;
}
}
if(v==2)
k++;
v=0;
}
System.out.print(k);
}
}