import java.io.*;
import java.util.Scanner;
public class Palindrome
{
public static void main(String a[])
{
int n,pal=0,temp,s;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(n>0)
{
s=n%10;
pal=(pal*10)+s;
n/=10;
}
if(temp==pal)
System.out.println(pal+"it is a palindrome");
else
System.out.println(pal+"it is not a palindrome");
}
}
