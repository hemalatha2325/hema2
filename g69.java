import java.util.*;
class g69{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int x=m-n;
        if(x%2==0){
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }
    }
}
