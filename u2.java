    import java.io.*;
    import java.util.*;
    import java.text.*;
    class j
    {
    public static void main(String aa[])throws IOException
    {
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    int i=0,n=0,t1=0,m=0,t2=0,t3=0;
    double s1=0,s2=0,s3=0,s4=0,k=0;
    n=Integer.parseInt(b.readLine());
    String r="\0";
    for(i=0;i<n;i++)
    {
    k=Double.parseDouble(b.readLine());
    if(k<16)
    {
    if(k==1||k==2||k==3)
    System.out.println("0");
    if(k==4||k==5)
    System.out.println("3");
    if(k==6)
    System.out.println("8");
    if(k==7)
    System.out.println("14");
    if(k==8)
    System.out.println("14");
    if(k==9)
    System.out.println("14");
    if(k==10)
    System.out.println("23");
    if(k==11)
    System.out.println("33");
    if(k==12)
    System.out.println("33");
    if(k==13)
    System.out.println("45");
    if(k==14)
    System.out.println("45");
    if(k==15)
    System.out.println("45");
    }
    else
    {
    t1=(int)k/3;
    s1=((double)t1/2)*(6+(t1-1)*3);
    t2=(int)k/5;
    s2=((double)t2/2)*(10+(t2-1)*5);
    t3=(int)k/15;
    s3=((double)t3/2)*(30+(t3-1)*15);
    s4=s1+s2-s3;
    DecimalFormat f=new DecimalFormat("##");
    if(k%3==0&&k%5==0)
    System.out.println(f.format(s4-k));
    if(k%3==0&&k%5!=0)
    System.out.println(f.format(s4-k));
    if(k%3!=0&&k%5==0)
    System.out.println(f.format(s4-k));
    if(k%3!=0&&k%5!=0)
    System.out.println(f.format(s4));
    }
    }
    }
    }