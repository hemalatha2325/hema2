import java.util.*;
class g80{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        for(int i=0;i<len;i++){
            int m=Integer.valueOf(String.valueOf(s.charAt(i)));
            if(m%2!=0){
                System.out.print(m+" ");
            }
        }
    }
}
