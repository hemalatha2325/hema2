import java.io.*;
import java.util.*;
class g16
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //int temp=a;
        int flag=0,i,j;
        for(i=a;i<=b;i++)
            {
               for(j=2;j<i;j++)
               {
                   if(i%j==0)
                   {
                       flag=0;
                       break;
                   }
                   else
                   {
                       flag=1;
                   }
               }
               if(flag==1)
               {
                   System.out.println(i);
               }
            }
    }
}





