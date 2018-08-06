import java.io.*;
import java.util.*;
class g17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp,c=0,a;
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
        {
            System.out.print("Yes");
        }
        else{
            System.out.print("NO");
        }
    }
}
