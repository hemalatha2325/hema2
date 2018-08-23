import java.util.*;
class g91{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int area=(int)2*(x*y+x*z+y*z);
        int cube=x*y*z;
        System.out.print(area+" "+cube);
    }
}
