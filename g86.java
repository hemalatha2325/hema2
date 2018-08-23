import java.util.*;
class g86{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int flag=0;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j] && i!=j){
                    flag=1;
                }
            }
        }
        if(flag==0){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
