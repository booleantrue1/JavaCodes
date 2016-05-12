import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0;
String s[]={"Washington","Adams","Jefferson","Madison","Monroe","Adams","Jackson","Van Buren","Harrison","Tyler","Polk","Taylor","Fillmore","Pierce","Buchanan","Lincoln","Johnson","Grant","Hayes","Garfield","Arthur","Cleveland","Harrison","Cleveland","McKinley","Roosevelt","Taft","Wilson","Harding","Coolidge","Hoover","Roosevelt","Truman","Eisenhower","Kennedy","Johnson","Nixon","Ford","Carter","Reagan","Bush","Clinton","Bush","Obama"};
k=Integer.parseInt(b.readLine());
System.out.print(s[k-1]);
}
}