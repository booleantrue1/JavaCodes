import java.io.*;import java.math.*;import java.util.*;class j{
public static void main(String a[])throws IOException{Scanner b=new Scanner(System.in);int n,i;BigInteger m=new BigInteger("8");String s;n=Integer.parseInt(b.nextLine());
for(i=0;i<n;i++){s=b.nextLine();BigInteger l=new BigInteger(s);BigInteger p=new BigInteger(String.valueOf(Integer.parseInt(s)+2));BigInteger j=new BigInteger(String.valueOf(2*Integer.parseInt(s)+1));System.out.println(((l.multiply(p)).multiply(j)).divide(m));}}}