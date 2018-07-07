import java.io.*;
import java.util.*;
class guvi9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
            if(k%9==0)
            {
                System.out.print(9);
            }
            else
            {
                System.out.print(k%9);
            }
        
    }
}
