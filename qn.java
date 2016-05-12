import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int m=0,n=0,i=0,j=0;
long d=0,p=0;
String s,r="\0";
char q='\0';
s=b.readLine();
n=s.length();
for(i=0;i<n;i++)
{
q=s.charAt(i);
if(q=='>')
r+=1000;
if(q=='<')
r+=1001;
if(q=='+')
r+=1010;
if(q=='-')
r+=1011;
if(q=='.')
r+=1100;
if(q==',')
r+=1101;
if(q=='[')
r+=1110;
if(q==']')
r+=1111;
}
r=r.trim();
n=(4*n-1);
for(i=n;i>=0;i--,j++)
{
m=Integer.parseInt(r.substring(i,i+1));
p+=(long)((m*Math.pow(2,j)));
out.println(r.substring(i,i+1)+" "+p+" "+(p%1000003));
}
out.close();
}
}