import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,j=0,i=0;
int d[][]=new int[12][12];
for(i=0;i<12;i++)
for(j=0;j<12;j++)
d[i][j]=1;
String r;
r=b.readLine();
d[(int)(r.charAt(0))-95][Integer.parseInt(r.substring(1))+1]=0;
for(i=0;i<12;i++)
d[i][Integer.parseInt(r.substring(1))+1]=0;
for(i=0;i<12;i++)
d[(int)(r.charAt(0))-95][i]=0;
d[(int)(r.charAt(0))-95][Integer.parseInt(r.substring(1))+1]=0;
d[(int)(r.charAt(0))-95-1][Integer.parseInt(r.substring(1))+1-2]=0;
d[(int)(r.charAt(0))-95-1][Integer.parseInt(r.substring(1))+1+2]=0;
d[(int)(r.charAt(0))-95+1][Integer.parseInt(r.substring(1))+1-2]=0;
d[(int)(r.charAt(0))-95+1][Integer.parseInt(r.substring(1))+1+2]=0;
d[(int)(r.charAt(0))-95+2][Integer.parseInt(r.substring(1))+1-1]=0;
d[(int)(r.charAt(0))-95-2][Integer.parseInt(r.substring(1))+1-1]=0;
d[(int)(r.charAt(0))-95+2][Integer.parseInt(r.substring(1))+1+1]=0;
d[(int)(r.charAt(0))-95-2][Integer.parseInt(r.substring(1))+1+1]=0;
r=b.readLine();
d[(int)(r.charAt(0))-95][Integer.parseInt(r.substring(1))+1]=0;
d[(int)(r.charAt(0))-95-1][Integer.parseInt(r.substring(1))+1-2]=0;
d[(int)(r.charAt(0))-95-1][Integer.parseInt(r.substring(1))+1+2]=0;
d[(int)(r.charAt(0))-95+1][Integer.parseInt(r.substring(1))+1-2]=0;
d[(int)(r.charAt(0))-95+1][Integer.parseInt(r.substring(1))+1+2]=0;
d[(int)(r.charAt(0))-95+2][Integer.parseInt(r.substring(1))+1-1]=0;
d[(int)(r.charAt(0))-95-2][Integer.parseInt(r.substring(1))+1-1]=0;
d[(int)(r.charAt(0))-95+2][Integer.parseInt(r.substring(1))+1+1]=0;
d[(int)(r.charAt(0))-95-2][Integer.parseInt(r.substring(1))+1+1]=0;
for(i=2;i<10;i++)
for(j=2;j<10;j++)
if(d[i][j]==1)
k++;
System.out.print(k);
}
}