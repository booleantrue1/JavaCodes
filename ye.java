import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,k=-1,n=0,i=0;
String s[];
String r[];
n=Integer.parseInt(b.readLine());
s=new String[n];
r=new String[n];
s[0]=b.readLine();
for(i=1;i<n;i++)
{
s[i]=b.readLine();
for(j=i-1;j>=0;j--)
k=s[j].indexOf(s[i]);
if(k==0)

if(k==0)
r[i]="OK";
else
r[i]=s[i]+String.valueOf(k);
k=0;
}
for(i=0;i<n;i++)
System.out.println(r[i]);
}
}