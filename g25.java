import java.io.*;
import java.util.*;
class g25
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int m=n/2;
        System.out.println(a[m]);
    }
}                             



