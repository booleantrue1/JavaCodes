import java.io.*;
import java.util.*;
class j{public static void main(String a[])throws IOException{BufferedReader b=new BufferedReader(new InputStreamReader(System.in));int i,p,k,m;double x,n;k=Integer.parseInt(b.readLine());char d[]=new char[k];String r,t,u="\0",s,y="\0";char q='\0';for(i=0;i<k;i++){s=b.readLine();StringTokenizer c=new StringTokenizer(s);r=c.nextToken();t=c.nextToken();if(t.compareTo("0")==0)d[i]='1';else{q=r.charAt(r.length()-1);u+=q;u=u.trim();m=Integer.parseInt(u);n=Double.parseDouble(t);if(q=='0'||q=='5'||q=='6'||q=='1')d[i]=q;else{x=n%4;if(x==0)x=4;y=String.valueOf((int)Math.pow(m,x));d[i]=y.charAt(y.length()-1);}}u="\0";}for(i=0;i<k;i++)System.out.println(d[i]);}}