import java.io.*;import java.util.*;class j{public static void main(String aa[])throws IOException{Scanner b=new Scanner(System.in);int j=0,i=0,k=0,t=0,y=0,x=0;String s;t=Integer.parseInt(b.nextLine());for(k=0;k<t;k++){s=b.nextLine();StringTokenizer c=new StringTokenizer(s);x=Integer.parseInt(c.nextToken());y=Integer.parseInt(c.nextToken());int d[][]=new int[x][y];s=b.nextLine();s=s.replace('[',' ');s=s.replace(']',' ');s=s.replace('(',' ');s=s.replace(')',' ');s=s.replace(',',' ');s=s.replace("   ","  ");s=s.replace("  "," ");StringTokenizer z=new StringTokenizer(s.trim());for(i=0;i<x;i++)for(j=0;j<y;j++)d[i][j]=Integer.parseInt(z.nextToken());System.out.print("[");for(i=0;i<y;i++){System.out.print("(");for(j=0;j<x;j++){if(j==x-1)System.out.print(d[j][i]);else System.out.print(d[j][i]+", ");}System.out.print(")");if(i!=y-1)System.out.print(", ");}System.out.println("]");}}}