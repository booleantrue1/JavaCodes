import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,j=0,m=0,i=0,n=0;
String s,r="\0";
m=Integer.parseInt(b.readLine());
for(i=0;i<m;i++)
{
s=b.readLine();
n=s.length();
s=s.toLowerCase();
for(j=0;j<n;j++)
{
if(s.charAt(j)=='a'||s.charAt(j)=='b'||s.charAt(j)=='c')
r+='2';
if(s.charAt(j)=='d'||s.charAt(j)=='e'||s.charAt(j)=='f')
r+='3';
if(s.charAt(j)=='g'||s.charAt(j)=='h'||s.charAt(j)=='i')
r+='4';
if(s.charAt(j)=='j'||s.charAt(j)=='k'||s.charAt(j)=='l')
r+='5';
if(s.charAt(j)=='m'||s.charAt(j)=='n'||s.charAt(j)=='o')
r+='6';
if(s.charAt(j)=='p'||s.charAt(j)=='q'||s.charAt(j)=='r'||s.charAt(j)=='s')
r+='7';
if(s.charAt(j)=='t'||s.charAt(j)=='u'||s.charAt(j)=='v')
r+='8';
if(s.charAt(j)=='w'||s.charAt(j)=='x'||s.charAt(j)=='y'||s.charAt(j)=='z')
r+='9';
}
r=r.trim();
for(j=0;j<n;j++)
{
if(r.charAt(j)!=r.charAt(n-j-1))
{
f=1;
System.out.println("NO");
break;
}
}
if(f==0)
System.out.println("YES");
f=0;
r="\0";
}
}
}