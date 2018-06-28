import java.io.*;
import java.util.*;
class guvi4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
char a[]=s.toCharArray();
for(int i=0;i<a.length;i++)
{
if(a[i]>=(char)65)
{
System.out.print("Alphabet");
}
else
{
System.out.print("Charater");
}
}
}
}
