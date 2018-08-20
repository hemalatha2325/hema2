import java.util.*;
class g57{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==m){
                count++;
            }
        }
        System.out.print(count);
    }
}
