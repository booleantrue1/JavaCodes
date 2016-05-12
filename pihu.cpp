import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
   int n,i,test,ptr,j;
   test=Integer.parseInt(b.readLine());
   while(j=0;j<test;j++)
   {
      int flag=0;
      n=Integer.parseInt(b.readLine());
      long arr[n];
      for(i=0;i<n;i++)
      arr[i]=Long.parseLong(b.readLine());
      Arrays.sort(arr);
      long p=Long.parseLong(b.readLine());
      for(ptr=0;ptr<n-2;ptr++)
      {
      int top=n-1;
      int bot=ptr+1;
      while(top-bot>0)
      {
         long k=arr[ptr]+arr[top]+arr[bot];
         if(k==p)
         {
            flag=1;
            break;
         }
         if(k>p)
         top--;
         if(k<p)
         bot++;
      }
      if(flag==1)
      break;
      }
      if(flag==1)
      System.out.print("YES\n");
      else
      System.out.print("NO\n");
   }
}
}