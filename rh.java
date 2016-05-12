import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int min=1,i=0,j=0,k=0;
k=Integer.parseInt(b.readLine());
int max=k*k;
for(i=0;i<k;i++)
{
for(j=0;j<k/2;j++)
System.out.print((min++)+" "+(max--)+" ");
System.out.println();
}
}
}