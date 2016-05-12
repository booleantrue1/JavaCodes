import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
   int t,i=0;
   String s;
   t=Integer.parseInt(b.readLine());
   BigDecimal D=new BigDecimal("0");
   BigDecimal ans=new BigDecimal("0");
   BigDecimal cut=new BigDecimal("0");
   BigDecimal tot=new BigDecimal("0");
   BigDecimal E=new BigDecimal("2");
   for(i=0;i<t;i++)
   {
      s=b.readLine();
	  StringTokenizer z=new StringTokenizer(s);
	  BigDecimal A=new BigDecimal(z.nextToken());
	  BigDecimal B=new BigDecimal(z.nextToken());
	  BigDecimal C=new BigDecimal(z.nextToken());
      if(A.compareTo(D)!=0&&B.compareTo(D)!=0&&C.compareTo(D)!=0)
      {
	  if(((A.add(B)).compareTo(C))<0)
	  {
	  System.out.println("1");
	  continue;
	  }
	  else
	  {
         ans=(C.multiply(C)).divide(E);
         if(C.compareTo(A)>0)
            cut=cut.add(((C.subtract(A)).multiply(C.subtract(A))).divide(E));
         if(C.compareTo(B)>0)
            cut=cut.add(((C.subtract(B)).multiply(C.subtract(B))).divide(E));
            tot=A.multiply(B);
            System.out.println((ans.subtract(cut)).divide(tot));
            continue;
      }
	  }
      if(A.compareTo(D)==0&&B.compareTo(D)!=0&&C.compareTo(D)!=0)
      {
         if(B.compareTo(C)<0)
            System.out.print("1\n");
         else
            System.out.println(C.divide(B));
            continue;
      }
      if(B.compareTo(D)==0&&A.compareTo(D)!=0&&C.compareTo(D)!=0)
      {
         if(A.compareTo(C)<0)
            System.out.print("1\n");
         else
            System.out.println(C.divide(A));
            continue;
      }
      if(A.compareTo(D)!=0&&B.compareTo(D)!=0&&C.compareTo(D)==0)
      {
            System.out.print("0\n");
            continue;
      }
      if(A.compareTo(D)==0&&B.compareTo(D)==0&&C.compareTo(D)!=0)
      {
         System.out.print("1\n");
         continue;
      }
      if(A.compareTo(D)==0&&B.compareTo(D)!=0&&C.compareTo(D)==0)
      {
            System.out.print("0\n");
            continue;
      }
      if(A.compareTo(D)!=0&&B.compareTo(D)==0&&C.compareTo(D)==0)
      {
            System.out.print("0\n");
            continue;
      }
      if(A.compareTo(D)==0&&B.compareTo(D)==0&&C.compareTo(D)==0)
      {
            System.out.print("1\n");
            continue;
      }
   }
}
}