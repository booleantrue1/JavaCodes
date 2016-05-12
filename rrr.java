import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String s;
int p=0,j=0,i=0,r=0;
char q='\0';
String z="1",m="\0";
s=b.readLine();
p=s.length();
for(i=0;i<p;i++)
{
q=s.charAt(i);
m=String.valueOf(i+1);
StringTokenizer c=new StringTokenizer(z);
g=c.countTokens();
for(j=0;j<g;j++)
if(((c.nextToken()).compareTo(m))==0)
u=j;
if(q=='l')

else