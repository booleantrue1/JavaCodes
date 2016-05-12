import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
Scanner f = new Scanner(System.in);
int i=0,max=-1,n=0,j=0,f1=0,p=0,k=0;
String s;
String d[]=new String[1005];
while(f.hasNextLine())
{
d[i]=f.nextLine();
n=d[i].length();
i++;
if(n>max)
max=n;
}
for(j=0;j<max+2;j++)
System.out.print("*");
System.out.print("\n");
for(j=0;j<i;j++)
{
System.out.print("*");
if(d[j].length()==0)
{
for(k=0;k<max;k++)
System.out.print(" ");
System.out.print("*");
System.out.print("\n");
continue;
}
if(max%2==0)
{
p=d[j].length();
if(p%2==0)
{
for(k=0;k<(max-p)/2;k++)
System.out.print(" ");
System.out.print(d[j]);
for(k=0;k<(max-p)/2;k++)
System.out.print(" ");
}
else
{
if(f1==0)
{
for(k=0;k<(max-p)/2;k++)
System.out.print(" ");
System.out.print(d[j]);
for(k=0;k<(max-p)-(max-p)/2;k++)
System.out.print(" ");
f1=1;
}
else
{
for(k=0;k<Math.ceil((double)(max-p)/2);k++)
System.out.print(" ");
System.out.print(d[j]);
for(k=0;k<(max-p)-Math.ceil((double)(max-p)/2);k++)
System.out.print(" ");
f1=0;
}
}
}
else
{
p=d[j].length();
if(p%2!=0)
{
for(k=0;k<(max-p)/2;k++)
System.out.print(" ");
System.out.print(d[j]);
for(k=0;k<(max-p)/2;k++)
System.out.print(" ");
}
else
{
if(f1==0)
{
for(k=0;k<(max-p)/2;k++)
System.out.print(" ");
System.out.print(d[j]);
for(k=0;k<(max-p)-(max-p)/2;k++)
System.out.print(" ");
f1=1;
}
else
{
for(k=0;k<Math.ceil((double)(max-p)/2);k++)
System.out.print(" ");
System.out.print(d[j]);
for(k=0;k<(max-p)-Math.ceil((double)(max-p)/2);k++)
System.out.print(" ");
f1=0;
}
}
}
System.out.print("*");
System.out.print("\n");
}
for(j=0;j<max+2;j++)
System.out.print("*");
System.out.print("\n");
}
}