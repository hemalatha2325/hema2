import java.util.*;
class g56{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0,c=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                count++;
            }
            else if(Character.isDigit(s.charAt(i))){
                c++;
            }
        }
        if(count>0 && c>0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
