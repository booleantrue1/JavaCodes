import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i,j,k,n,reqjump=1,jump=1;
String s;
k=Integer.parseInt(b.readLine());
for(j=0;j<k;j++)
{
reqjump=1;
jump=1;
int count=0,flag=0;
s=b.readLine();
for(i=0;i<s.length();i++)
{
if(s.charAt(i)=='#')
{
if(flag==0)
continue;
else
{
if(reqjump<=jump)
{
reqjump=1;
continue;
}
else
{
count++;
jump=reqjump;
}
}
flag=0;
reqjump=1;
}
else
{
reqjump++;
flag=1;
}
}
System.out.println(count);
}
}
}