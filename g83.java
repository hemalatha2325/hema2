import java.util.*;
import java.lang.*;
class g83{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        int n=(int)Math.abs(a%b);
        int m=(int)Math.abs(a/b);
        System.out.println(m);
        System.out.println(n);
    }
}

