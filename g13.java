import java.io.*;
import java.util.*;
class g13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m,flag=0;
        m=n/2;
        if(n==0 || n==1)
        {
            System.out.print("not a prime");
        }
        else
        {
            for(int i=2;i<m;i++)
            {
                if(n%i==0)
                {
                    System.out.print("not a prime");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.print("prime");
        }
    }
}

