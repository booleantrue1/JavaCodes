import java.io.*;
import java.util.*;
class b5
{
    public static void main(String args[])throws IOException
    {
        Scanner f = new Scanner(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        String s1="";
        String s[]=new String[1000];
        int i=0,j,k,max=0,l,m=0,a,b,c,d;
        while(f.hasNextLine())
        {
            s[i]=f.nextLine();
            m=s[i].length();
			i++;
            if(m>max)
            max=m;
        }
        k=i;
        for(i=0;i<max+2;i++)
        out.print("*");
        out.println();
        for(i=0;i<k;i++)
        {
            out.print("*");
            l=s[i].length();
            a=(max-l)/2;
            for(j=0;j<a;j++)
            s1=s1+" ";
            if((max-l)%2!=0)
            out.print(s1+s[i]+s1+" ");
            else
            out.print(s1+s[i]+s1);
            out.print("*");
            s1="";
            out.println();
        }
        for(i=0;i<max+2;i++)
        out.print("*");
		out.close();
    }
}