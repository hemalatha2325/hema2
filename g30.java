import java.util.*;
class g30{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[2];
        int b[]=new int[2];
        for(int i=0;i<2;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<2;i++){
            b[i]=sc.nextInt();
        }
        int m=0,n=0;
        for(int i=0;i<2-1;i++){
            m=Math.abs(a[i]-b[i]);
            n=Math.abs(a[i+1]-b[i+1]);
        }
        System.out.print(m+" "+n);
    }
}



