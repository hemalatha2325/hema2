import java.util.*;
class g42{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int l1=s1.length();
        int l2=s2.length();
        if(l1>l2){
            System.out.print(s1);
        }
        else if(l1<l2){
            System.out.print(s2);
        }
        else if(l1==l2){
            System.out.print(s1);
        }
    }
}

