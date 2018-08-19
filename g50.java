import java.util.*;
class g50{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<n;i++){
            int m=(int)Math.pow(2,i);
            if(m==n){
                c++;
            }
        }
        if(c==1){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
