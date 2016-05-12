import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,f=0,i=0;
String s;
s=b.readLine();
n=s.length();
s+="11";
for(i=0;i<n;i++)
{
if(s.charAt(i)=='1'&&s.charAt(i+1)=='4'&&s.charAt(i+2)=='4')
{
i+=2;
continue;
}
if(s.charAt(i)=='1'&&s.charAt(i+1)=='4'&&s.charAt(i+2)!='4')
{
i+=1;
continue;
}
if(s.charAt(i)=='1'&&s.charAt(i+1)!='4')
{
continue;
}
f=1;
break;
}
if(f==1)
System.out.print("NO");
else
System.out.print("YES");
}
}