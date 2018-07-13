import java.io.*;
import java.util.*;
class g12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int r,sum=0;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.print("palindrome");
        }
        else
        {
            System.out.print("Not a palrindrome");
        }
    }
}

