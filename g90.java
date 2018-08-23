import java.util.*;
class g90{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                s1=s1+String.valueOf(s.charAt(i));
            }
        }
        System.out.print(s1);
    }
}
