import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,j=0,n=0,i=0;
String s,r;
r=b.readLine();
s=b.readLine();
s+="A";
n=r.length();
for(i=0;i<n;i++)
if(s.charAt(i)!=r.charAt(i))
break;
r=r+"A";
if(((r.substring(i+1)).compareTo(s.substring(i)))!=0)
{
System.out.print("0");
System.exit(0);
}
for(j=i;j>=0;j--)
{
if(r.charAt(j)==r.charAt(i))
k++;
else
break;
}
j++;
System.out.println(k);
for(i=0;i<k;i++,j++)
System.out.print(j+1+" ");
}
}