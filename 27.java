import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,j=0,i=0;
String s[]=new String[8];
String r[]=new String[8];
for(i=0;i<8;i++)
r[i]=" ";
for(i=0;i<8;i++)
{
s[i]=b.readLine();
if(s[i].compareTo("BBBBBBBB")==0)
k++;
}
if(k==8)
{
System.out.print(k);
System.exit(0);
}
else
{
for(i=0;i<8;i++)
{
for(j=0;j<8;j++)
{
r[i]+=(s[j].charAt(i));
}
r[i]=r[i].trim();
}
for(i=0;i<8;i++)
{
if(r[i].compareTo("BBBBBBBB")==0)
k++;
}
System.out.print(k);
}
}
}