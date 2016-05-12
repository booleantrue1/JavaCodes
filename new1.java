/*
ID: maheshm1
LANG: JAVA
PROG: gift1
*/
import java.io.*;
import java.util.*;

class gift1 {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    int i=0,k=0,j=0,u=0,v=0,w=0,x=0,q=0,l=0,m=0,n=0;
	String s,r;
	n=Integer.parseInt(f.readLine());
	String d[]=new String[n];
	int e[]=new int[n];
	e[0]=0;
	int g[]=new int[n];
	for(i=0;i<n;i++)
	d[i]=f.readLine();
	for(i=0;i<n;i++)
	{
	r=f.readLine();
	for(j=0;j<n;j++)
	{
	if(d[j].compareTo(r)==0)
	{
	k=j;
	break;
	}
	}
	r=f.readLine();
	StringTokenizer c=new StringTokenizer(r);
	g[k]=Integer.parseInt(c.nextToken());
	w=Integer.parseInt(c.nextToken());
	if(w!=0)
	{x=g[k]/w;
	e[k]+=g[k]%w;
	}
	else
	x=g[k];
	for(q=0;q<w;q++)
	{
	r=f.readLine();
	for(j=0;j<n;j++)
	{
	if(d[j].compareTo(r)==0)
	{
	e[j]+=x;
	break;
	}
	}
	}
	}
	for(i=0;i<n;i++)
	out.println(d[i]+" "+(e[i]-g[i]));              	// output result
    out.close();                                  // close the output file
    System.exit(0);                               // don't omit this!
  }
}

