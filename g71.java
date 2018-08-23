import java.util.*;
class g71{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String ss=sb.toString();
        if(s.equals(ss)){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
