import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
Scanner b=new Scanner(System.in);
int i=0,j=0,m=0;
String r,s;
while(b.hasNextLine())
{
s=b.nextLine();
int d[]=new int[26];
r=b.nextLine();
int e[]=new int[26];
for(i=0;i<s.length();i++)
d[(int)s.charAt(i)-97]++;
for(i=0;i<r.length();i++)
e[(int)r.charAt(i)-97]++;
for(i=0;i<26;i++)
{
m=(int)Math.min(d[i],e[i]);
for(j=0;j<m;j++)
System.out.print((char)(i+97));
}
System.out.print("\n");
}
}
}