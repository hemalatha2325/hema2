import java.util.*;
class g85{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1="",s2="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                s1=s1+String.valueOf(s.charAt(i));
            }
            else{
                s2=s2+String.valueOf(s.charAt(i));
            }
        }
        String ss=s1+" "+s2;
        System.out.print(ss);
    }
}
