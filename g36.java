import java.util.*;
class g36{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ss="!@#$%^&*().,_";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(ss.contains(String.valueOf(s.charAt(i)))){
                c++;
            }
        }
        System.out.print(c);
    }
}
