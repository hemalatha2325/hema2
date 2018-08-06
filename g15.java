import java.util.*;
class g15{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=m+1;i<n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

