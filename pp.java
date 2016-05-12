import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,k=0,n=0,p=0; 
String s[];
String q;
n=Integer.parseInt(b.readLine());
p=n;
s=new String[n+1];
for(i=0;i<=p;i++)
s[i]="\0";
for(i=0;i<=p;i++)
{
for(j=1;j<(2*n-1);j++)
{
s[i]=s[i]+' ';
}
for(k=0;k<=i;k++)
{
q=String.valueOf(k);
s[i]=s[i]+' '+q;
}
for(k=i-1;k>=0;k--)
{
q=String.valueOf(k);
s[i]=s[i]+' '+q;
}
n--;
}
s[p]=s[p].trim();
for(i=0;i<=p;i++)
{
System.out.print(s[i]);
System.out.print("\b"+"\n");
}
for(i=p-1;i>=0;i--)
{
System.out.print(s[i]);
System.out.print("\b");
if(i!=0)
System.out.print("\n");
}
}
}