import java.util.*;
class g62{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=1;
        char a[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(a[i]!='0' && a[i]!='1'){
                n=0;
                break;
            }
        }
        if(n==0){
            System.out.print("no");
        }
        else{
            System.out.print("yes");;
        }
    }
}

