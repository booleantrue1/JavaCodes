import java.io.*;
import java.util.*;
class j
{
static long fact[]=new long[1000009];
static long invfact[]=new long[1000009];
static long mod_expo(long a,long b,long p)
{
   long ans=1;
   a%=p;
   while(b!=0)
   {
      if(b%2==1)
      ans=(ans*a)%p;
      b/=2;
      a=(a*a)%p;
   }
   return ans;
}
static void pre_calculate()
{
   int i=0;
   fact[1]=1;
   invfact[1]=1;
   for(i=2;i<1000009;i++)
   {
      fact[i]=(fact[i-1]*i)%1000000007;
      invfact[i]=mod_expo(fact[i],1000000005,1000000007);
   }
}
static long nCr(int n,int r)
{
   if(r==0||r==n)
      return 1;
   if(n<r)
      return 0;
   long ans=(fact[n]*((invfact[r]*invfact[n-r])%1000000007))%1000000007;
   return ans;
}
public static void main(String a[])throws IOException
{
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    int x=0,i=0,n=0,m=0;
    String s="\0";
    pre_calculate();
    s=b.readLine();
    StringTokenizer c=new StringTokenizer(s);
    m=Integer.parseInt(c.nextToken());
    for(x=1;x<=m;x++)
    {
    	s=b.readLine();
	    StringTokenizer p=new StringTokenizer(s);
	    int l=Integer.parseInt(p.nextToken());
	    int r=Integer.parseInt(p.nextToken());
	    int tp=0;
	    if(l<r)
	    	tp=l;
	    else
	    	tp=r;
	    System.out.println("Case #"+x+": "+nCr(l+r,tp));
    }
}
}