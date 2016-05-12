import java.io.*;
import java.math.*;
import java.util.*;
class j
{
	public static void main(String a[])throws IOException
	{
//		int j=0,i=0;
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String tmp;
		int n=Integer.parseInt(b.readLine());
		BigInteger dividend=new BigInteger("1");
		BigInteger fin=new BigInteger("1");
		BigInteger arr[]=new BigInteger[100009];
		tmp=b.readLine();
		StringTokenizer c=new StringTokenizer(tmp);
		for(int i=0;i<n;i++)
		{
			String t=c.nextToken();
			BigInteger now=new BigInteger(t);
			arr[i]=now;
		}
		int q;
		q=Integer.parseInt(b.readLine());
		for(int i=0;i<q;i++)
		{
		    String t=b.readLine();
			BigInteger now=new BigInteger(t);
			dividend=dividend.multiply(now);			
		}
		for(int i=0;i<n;i++)
		{
			fin=arr[i].divide(dividend);
			System.out.print(fin+" ");
		}
	}
}
