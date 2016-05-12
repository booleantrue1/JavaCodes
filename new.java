import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int d[];
int e[]=new int[5];
int i=0,j=0,h=0,p=0;
for(i=0;i<5;i++)
e[i]=Integer.parseInt(b.readLine());
d=new int[e[4]];
d[0]=0;
for(i=0;i<4;i++)
{
h=e[i];
for(j=0;j<e[4];j++)
{
if((j+1)%h==0)
d[j]=1;
}
}
for(j=0;j<e[4];j++)
{
if(d[j]==1)
{
p++;
}
}
System.out.print(p);
}
}