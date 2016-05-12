import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,n=0,j=0,i=0;
n=Integer.parseInt(b.readLine());
String s;
for(i=0;i<n;i++)
{
s=b.readLine();
if(s.compareTo("ABSINTH")==0||s.compareTo("BEER")==0||s.compareTo("BRANDY")==0||s.compareTo("CHAMPAGNE")==0||s.compareTo("GIN")==0||s.compareTo("RUM")==0||s.compareTo("SAKE")==0||s.compareTo("TEQUILA")==0||s.compareTo("VODKA")==0||s.compareTo("WHISKEY")==0||s.compareTo("WINE")==0)
k++;
else
{
if(s.charAt(0)>47&&s.charAt(0)<58)
{
j=Integer.parseInt(s);
if(j<18)
k++;
}
}
}
System.out.print(k);
}
}