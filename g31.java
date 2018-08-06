import java.util.*;
class g31{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s1[]=str.split(" ");
        int count=0;
        for(String s:s1){
            char a[]=s.toCharArray();
            for(int i=0;i<a.length;i++){
                count++;
            }
        }
        System.out.print(count);
    }
}
