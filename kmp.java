import java.io.*;
import java.util.*;
class kmpc
{
static String arr[]=new String[100];
kmpc()
{
arr[0]="google";
arr[1]="facebook";
arr[2]="youtube";
arr[3]="twitter";
arr[4]="gmail";
arr[5]="amazon";
arr[6]="flipkart";
arr[7]="microsoft";
arr[8]="technex";
}
void preKMP(String pattern, int f[])
{
    int m=pattern.length(),k;
    f[0]=-1;
    for(int i=1;i<m;i++)
    {
        k=f[i-1];
        while(k>=0)
        {
            if(pattern.charAt(k)==pattern.charAt(i-1))
                break;
            else
                k=f[k];
        }
        f[i]=k+1;
    }
}
boolean KMP(String pattern,String target)
{
    int m=pattern.length();
    int n=target.length();
    int f[]=new int[m];     
    preKMP(pattern,f);     
    int i=0;
    int k=0;        
    while(i<n)
    {
        if(k==-1)
        {
            i++;
            k=0;
        }
        else if(target.charAt(i)==pattern.charAt(k))
        {
            i++;
            k++;
            if(k==m)
                return true;
        }
        else
            k=f[k];
    }
    return false;
}
public static void main(String aa[])throws IOException
{
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    String pat;
	int i=0,count=9;
	pat=b.readLine();
	kmpc obj=new kmpc();
	for(i=0;i<count;i++)
    {
	String tar=arr[i];
	if(obj.KMP(pat,tar))
        System.out.println(tar);
	}
}
}