import java.io.*;
class x
{
public static void main(String a[])throws IOException
{
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
int p=0,i=0;
String s=obj.readLine();
char c='\0';
String d="\0";
for(int k=0;k<d.length();k++)
{
c=s.charAt(i);
if(d.charAt(k)==c)
break;
for(int j=0;j<s.length();j++)
if(s.charAt(j)==c)
p++;
System.out.println("the no. of times "+c+" has occured is "+p);
p=0;
d=d+c;
i++;
}
}
}