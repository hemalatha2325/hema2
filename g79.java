import java.util.*;
class g79{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=m*n;
        int y=(int)Math.sqrt(x);
        if(y*y==x){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
