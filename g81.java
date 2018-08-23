import java.util.*;
import java.lang.*;
class g81{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        int x=0;
        for(int i=0;i<s1.length;i++){
            int m=Integer.valueOf(s1[i]);
            x=(int)Math.abs(x-m);
        }
        System.out.print(x);
    }
}
