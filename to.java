import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,k=0,l=0,i=0,m=0,n=0,p=0;
String r,s,t;
char u='\0';
r=b.readLine();
s=b.readLine();
t=b.readLine();
m=r.length();
n=s.length();
p=t.length();
for(i=0;i<m;i++)
{
u=r.charAt(i);
if(u=='a'||u=='e'||u=='i'||u=='o'||u=='u')
j++;
}
for(i=0;i<n;i++)
{
u=s.charAt(i);
if(u=='a'||u=='e'||u=='i'||u=='o'||u=='u')
k++;
}
for(i=0;i<p;i++)
{
u=t.charAt(i);
if(u=='a'||u=='e'||u=='i'||u=='o'||u=='u')
l++;
}
if(j==5&&k==7&&l==5)
System.out.print("YES");
else
System.out.print("NO");
}
}