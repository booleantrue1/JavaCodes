import java.io.*;
import java.util.*;
class j {

    public static void main(String[] args)throws IOException{
		new j().input();
	}
    public void sort(int a[],int rad,int max){
        int tmp[][]=new int[a.length][10];

        for(int i=0;i<max;i++){

            int c=0;
            for (int j=0;j<a.length;j++)
                for(int k=0;k<rad;k++)
                    tmp[j][k]=0;

            for(int k=0;k<a.length;k++){
                int d=(int)((a[k]/Math.pow(10,i))%10);
                tmp[k][d]=a[k];
            }

            for (int j=0;j<rad;j++)
                for(int k=0;k<a.length;k++)
                    if(tmp[k][j]!=0)
                        a[c++]=tmp[k][j];
        }

        disp(a);
    }

    public void input()throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        int f=0;
		int a[]=new int[n];
       
        int max=0;
        for (int i = 0; i<n; i++) {
            
            a[i]=Integer.parseInt(br.readLine());
            if(a[i]==0)
			f=1;
			if(a[i]>max)
                max=a[i];
        }
		if(f==1)
		{
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		System.exit(0);
        }
		sort(a,10,digit_count(max));
     }

    int digit_count(int n){
        int d=0;
        while (n!=0) {
            d++;
            n/=10;
        }
        return d;
    }

    public void disp(int a[]){
     
	
        for (int i = 0; i<a.length; i++)
            System.out.println(a[i]);
    }
}
