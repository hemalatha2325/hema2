import java.util.*;
class g32{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s[]=str.split(" ");
        int count=0;
        for(String s1:s){
            count++;
        }
        System.out.print(count);
    }
}
