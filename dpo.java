import java.io.*;import java.util.*;class j{public static void main(String a[])throws IOException
{
Scanner b=new Scanner(System.in);
int c=0,r=0,t=0,j=0,i=0;
t=b.nextInt();
while(--t>=0)
{
r=b.nextInt();
c=b.nextInt();
System.out.print(r+" "+c);
String s=b.nextLine();
s=s.replace('(',' ');s=s.replace(')',' ');s=s.replace('[',' ');s=s.replace(']',' ');s=s.replace(',',' ');
StringTokenizer z=new StringTokenizer(s.trim());
int d[][]=new int[r][c];
for(i=0;i<r;i++)
for(j=0;j<c;j++)
d[i][j]=Integer.parseInt(z.nextToken());
System.out.print("[");
for(i=0;i<c;i++)
{
System.out.print("(");
for(j=0;j<r;j++)
{
if(j==r-1)
System.out.print(d[j][i]+")");
else
System.out.print(d[j][i]+",");
}
System.out.print(",");
}
System.out.println("]");
}
}
}