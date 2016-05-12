import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader f = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int n=0,flag=0,i=0,min=1000000,p=0,j=0,k=0;
for(i=0;i<=1000;i++)
{
n=i;
flag=0;
for(j=0;j<1010;j++)
      {
         int sum=0;
         if(n==1)
         {
            flag=1;
            break;
         }
         while(n!=0)
         {
            sum+=(n%10)*(n%10);
            n/=10;
         }
         n=sum;
      }
      if(flag==0)
         out.print("0,");
      else
         out.print(j+",");
}
out.close();
}
}