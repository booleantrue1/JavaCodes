class A implements Runnable
{
public void run()
{
for(int i=0;i<5;i++)
System.out.println("FROM THREAD A : "+i);
System.out.println("END OF THREAD A");
}
}
class B implements Runnable
{
public void run()
{
for(int j=0;j<5;j++)
{
if(j==2)
{
try
{
Thread.suspend();
}
catch(Exception e){}
}
System.out.println("FROM THREAD B : "+j);
}
System.out.println("END OF THREAD B");
}
}
class C implements Runnable
{
public void run()
{
for(int k=0;k<5;k++)
System.out.println("FROM THREAD C : "+k);
System.out.println("END OF THREAD C");
}
}
class threadtest
{
public static void main(String aa[])
{
A ob=new A();
B o2=new B();
C o3=new C();
Thread th1=new Thread(ob);
Thread th2=new Thread(o2);
Thread th3=new Thread(o3);
/*o3.setPriority(Thread.MAX_PRIORITY);
o2.setPriority(o1.getPriority()+1);
o1.setPriority(Thread.MIN_PRIORITY);
*/
System.out.println("THREAD A BEGINS");
th1.start();
System.out.println("THREAD B BEGINS");
th2.start();
System.out.println("THREAD C BEGINS");
th3.start();
System.out.println("main thread ends");
}
}