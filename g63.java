import java.util.*;
class g63{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print(a[0]);
    }
}
