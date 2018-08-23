import java.util.*;
class g73{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        int count=0;
        for(int i=l;i<r;i++){
            if(n==i){
                count++;
            }
        }
        if(count>0){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}

