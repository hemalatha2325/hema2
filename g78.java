import java.util.*;
class g78{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        for(int i=1;i<n;i++){
            if(n==i*13){
                flag=1;
            }
        }
        if(flag==1){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
