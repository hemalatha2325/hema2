import java.util.*;
class g67{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=10;i<10000;i+=10){
            if(n<i){
                System.out.print(i);
                break;
            }
        }
    }
}

