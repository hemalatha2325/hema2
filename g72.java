import java.util.*;
class g72{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="aeiou";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(str.contains(String.valueOf(s.charAt(i)))){
                count++;
            }
        }
        if(count>0){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
