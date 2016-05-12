import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int r=0,p=0,f=0,t=0,n=0,i=0,j=0;
String s="  2  3  5  7  11  13  17  23  29  ";
p=Integer.parseInt(b.readLine());
for(i=30;i<=p;i++)
{
for(j=2;j<=i/2;j++)
{
if(i%j==0)
{
f=1;
break;
}
}
if(f==0)
{
s+=(String.valueOf(i)+"  ");
System.out.println(s);
}
f=0;
}
for(i=1;i<=p;i++)
{
for(j=2;j<=i/2;j++)
{
r=s.indexOf(String.valueOf(j));
if(i%j==0&&r>=0&&(s.charAt(r-1))==' '&&(s.charAt(r+2))!=' ')
{
t++;
System.out.println(j+" "+t);
}
}
if(t==2)
n++;
t=0;
System.out.println(i+" "+n);
}
System.out.print(n);
}
}