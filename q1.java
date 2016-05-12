import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int i=0,counter=0,k=0;
out.print("int d[]={");
for(i=1;i<1000001;i++)
{
for(k=1;k*k<=i;k++)
if(i%k==0)
{
if(i/k==i)
counter++;
else
counter+=2;
}
out.print(counter+",");
counter=0;
}
out.close();
}
}
