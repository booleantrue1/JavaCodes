import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,n=0,m=0,i=0;
m=Integer.parseInt(b.readLine());
int d[];
d=new int[m];
if(m==3||m%256==0)
System.out.print("YES");
else
{
for(i=0;n<10000;i++)
{
n=n+i;
d[n%m]=1;
}
for(i=0;i<m;i++)
{
if(d[i]==0)
{
k=1;
break;
}
}
if(k==1)
System.out.print("NO");
else
System.out.print("YES");
}
}
}






A. BerOS file system
time limit per test:2 seconds
memory limit per test:64 megabytes
input:standard input
output:standard output
The new operating system BerOS has a nice feature. It is possible to use any number of characters '/' as a delimiter in path instead of one traditional '/'. For example, strings //usr///local//nginx/sbin// and /usr/local/nginx///sbin are equivalent. The character '/' (or some sequence of such characters) at the end of the path is required only in case of the path to the root directory, which can be represented as single character '/'.

A path called normalized if it contains the smallest possible number of characters '/'.

Your task is to transform a given path to the normalized form.

Input
The first line of the input contains only lowercase Latin letters and character '/' — the path to some directory. All paths start with at least one character '/'. The length of the given line is no more than 100 characters, it is not empty.

Output
The path in normalized form.

Sample test(s)
Input
//usr///local//nginx/sbin
Output
/usr/local/nginx/sbin
