import java.util.*;
class g51{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        String s="";
        while(n>0){
            a=n%10;
            s=s+String.valueOf(a)+" ";
            n=n/10;
        }
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String ss=String.valueOf(sb);
        System.out.print(ss+" ");
    }
}
