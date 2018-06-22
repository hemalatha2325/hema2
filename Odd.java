import java.io.*;
import java.util.*;
class Odd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>=1 && n<=100000)
{
if(n%2==0)
{
System.out.print("Even");
}
else
{
System.out.print("Odd");
}}
else
{
System.out.print("Invalid");
}}}
