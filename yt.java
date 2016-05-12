import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,f=0;
String y="WBWBWBWB";
String z="BWBWBWBW";
String s[]=new String[8];
for(i=0;i<8;i++)
s[i]=b.readLine();
for(i=0;i<8;i++)
{
if((s[i].compareTo(y)==0)||(s[i].compareTo(z)==0))
continue;
else
{
f=1;
break;
}
}
if(f==1)
System.out.print("NO");
else
System.out.print("YES");
}
}