import java.io.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,n=0,a=0,j=0,t=0,f=0,i=0;
char q='\0';
n=Integer.parseInt(b.readLine());
String s[];
s=new String[n];
for(i=0;i<n;i++)
s[i]=b.readLine();
t=s[0].length();
for(i=0;i<t;i++)
{
q=s[0].charAt(i);
for(j=0;j<n;j++)
{
if(s[j].charAt(i)!=q)
{
f=1;
break;
}
}
if(f==1)
break;
else
a++;
}
System.out.print(a);
}
}