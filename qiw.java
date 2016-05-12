import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i,j,k;
String s;
k=Integer.parseInt(b.readLine());
for(j=0;j<k;j++)
{
int max=-1,index=0,flag=0,dist=0;
int d[]=new int[26];
for(i=0;i<26;i++)
d[i]=0;
s=b.readLine();
for(i=0;i<s.length();i++)
if(s.charAt(i)!=' ')
d[s.charAt(i)-'A']++;
for(i=0;i<26;i++)
if(d[i]>max)
{
max=d[i];
index=i;
}
for(i=0;i<26;i++)
if(i!=index&&d[i]==max)
{
flag=1;
break;
}
if(flag==1)
System.out.println("NOT POSSIBLE");
else
{
dist=(index-4>=0)?index-4:22+index;
System.out.print(dist+" ");
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
System.out.print(" ");
continue;
}
System.out.print((char)(65+((s.charAt(i)-'A'+26-dist)%26)));
}
System.out.println();
}
}
}
}