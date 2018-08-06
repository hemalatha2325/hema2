import java.io.*;
import java.util.*;
class g29
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int hour=t/60;
        int min=t%60;
        System.out.print(hour+" "+min);
    }
}
