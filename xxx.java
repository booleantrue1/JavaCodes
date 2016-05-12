import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,i=0,t=0,f=0;
String s,q,g="\0";
char k='\0';
char m[];
s=b.readLine();
q=b.readLine();
t=s.length();
m=new char[t];
for(i=0;i<t;i++)
m[i]=s.charAt(i);
for(i=0;i<t/2;i++)
{
k=m[i];
m[i]=m[t-i-1];
m[t-i-1]=k;
}
for(i=0;i<t;i++)
g+=m[i];
g=g.trim();
if(g.compareTo(q)==0)
System.out.print("YES");
else
System.out.print("NO");
}
}