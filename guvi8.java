import java.io.*;
import java.util.*;
class guvi8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1,a=0;
        while(count<=n)
        {
            a=a+count;
            count++;
        }
        System.out.println(a);
    }
}
      
