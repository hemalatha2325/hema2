import java.util.*;
class g27{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean num=true;
        try{
            Double n=Double.parseDouble(str);
        }
        catch(NumberFormatException e){
            num=false;
        }
        if(num){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
