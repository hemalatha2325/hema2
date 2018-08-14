import java.util.*;
class g45{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        for(int i=0;i<s.length();i++){
        if(Character.isDigit(s.charAt(i))){
            c++;
        }
        }
        System.out.print(c);
    }
}
