import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
long m=0,t=0,p=0;
int i=0,n=0,j=0,k=0;
char q='\0';
String s;
t=Long.parseLong(b.readLine());
for(j=0;j<t;j++)
{
s=b.readLine();
s=b.readLine();
s=s.replace(" ","");
n=s.length();
for(i=0;i<n;i++)
if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
{
p=Long.parseLong(s.substring(0,i));
break;
}
k=i+1;
q=s.charAt(i);
for(i=k;i<n;i++)
{
if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
{
m=Long.parseLong(s.substring(k,i));
k=i+1;
if(q=='+')
p=p+m;
if(q=='-')
p=p-m;
if(q=='*')
p=p*m;
if(q=='/')
p=p/m;
q=s.charAt(i);
}
}
m=Long.parseLong(s.substring(k,n-1));
k=i+1;
if(q=='+')
p=p+m;
if(q=='-')
p=p-m;
if(q=='*')
p=p*m;
if(q=='/')
p=p/m;
System.out.println(p);
p=0;
k=0;
}
}
}