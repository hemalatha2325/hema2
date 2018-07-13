import java.io.*;
import java.util.*;
class g11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=1;
        while(n2!=0)
        {
            n3=n3*n1;
            n2--;
        }
        System.out.println(n3);
    }
}                              
