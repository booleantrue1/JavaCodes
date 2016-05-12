import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,k=0,f=0,n=0;
String s;
n=Integer.parseInt(b.readLine());
String d[]=new String[n];
d[0]="\0";
for(i=0;i<n;i++)
{
s=b.readLine();
for(j=0;j<k;j++)
if(d[j].equals(s))
{
f=1;
break;
}
if(f==0)
{
d[k]=s;
k++;
}
f=0;
}
System.out.print(k);
}
}