import java.util.*;
class g54{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.print(n);
        }
        else{
            int i=1;
            n=n-i;
            if(n%2==0){
                System.out.print(n);
            }
            i++;
        }
    }
}
