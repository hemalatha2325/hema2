import java.io.*;
import java.util.*;
class guvi5
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
Array.sort(a);
System.out.print(a[n-1]);
}
}
