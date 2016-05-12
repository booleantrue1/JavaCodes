import java.io.*;
class fil
{
static int r,x;
static String n,y,k;
static float p,z,q=0;
public static void filecre()throws IOException
{
DataOutputStream c=new DataOutputStream(new FileOutputStream("input.txt"));
DataInputStream d=new DataInputStream(System.in); 
r=Integer.parseInt(d.readLine());
n=d.readLine();
p=Float.parseFloat(d.readLine());
k=String.valueOf(r);
c.writeUTF(k);
c.writeUTF(n);
k=String.valueOf(p);
c.writeUTF(k);
c.close();
}
public static void fileread()throws IOException
{
DataInputStream e=new DataInputStream(new FileInputStream("input.txt"));
x=e.readInt();
y=e.readUTF();
z=e.readFloat();
System.out.println(x+" "+y+" "+z);
e.close();
}
public static void fileprint()throws IOException
{
DataOutputStream j=new DataOutputStream(new FileOutputStream("output.txt"));
k=String.valueOf(q);
j.writeUTF(k);
System.out.print(q);
j.close();
}
public static void main(String a[])throws IOException
{
fil f=new fil();
f.filecre();
f.fileread();
q=r+p;
f.fileprint();
}
}