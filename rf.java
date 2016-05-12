import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,n=0,m=0,p=0,u=0,v=0;
double t=0,x;
String s,r="\0";
s=b.readLine();
n=s.length();
for(i=0;i<n;i++)
{
if(s.charAt(i)=='>')
r+="1000";
if(s.charAt(i)=='<')
r+="1001";
if(s.charAt(i)=='+')
r+="1010";
if(s.charAt(i)=='-')
r+="1011";
if(s.charAt(i)=='.')
r+="1100";
if(s.charAt(i)==',')
r+="1101";
if(s.charAt(i)=='[')
r+="1110";
if(s.charAt(i)==']')
r+="1111";
}
r=r.trim();
for(i=4*n-1;i>=0;i--)
{
t=Integer.parseInt(s.substring(i,i+1);



253109
