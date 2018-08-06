import java.io.*;
import java.util.*;
class g18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<m;i++){
            //int d=0;
            int r=0;int z=i;
           /* while(z!=0)
            {
                z=z/10;
                d++;
            }*/
            z=i;
            while(z!=0)
            {
                int a=z%10;
                r=r+(a*a*a);
                z=z/10;
            }
            if(r==i)
            {
                System.out.println(i);
            }
        }
    }
}                              



