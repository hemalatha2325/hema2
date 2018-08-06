import java.util.*;
class g33{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char a[]=str.toCharArray();
        int count=0;
        if(str.contains(" ")){
            count++;
        }
        System.out.print(count);
    }
}
