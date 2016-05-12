import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,m=0;
String r,s;
s=b.readLine();
r=b.readLine();
m=s.length();
n=r.length();
int d[]=new int[52];
int e[]=new int[52];
for(i=0;i<m;i++)
{
if(s.charAt(i)>='a'&&s.charAt(i)<='z')
d[(int)(s.charAt(i))-97]++;
if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
d[(int)(s.charAt(i))-39]++;
}
for(i=0;i<n;i++)
{
if(r.charAt(i)>='a'&&r.charAt(i)<='z')
e[(int)(r.charAt(i))-97]++;
if(r.charAt(i)>='A'&&r.charAt(i)<='Z')
e[(int)(r.charAt(i))-39]++;
}
for(i=0;i<52;i++)
{
if(d[i]<e[i])
{
System.out.print("NO");
System.exit(0);
}
}
System.out.print("YES");
}
}