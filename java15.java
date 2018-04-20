import java.io.*;
import java.util.*;
public class Java15
{
public static void main(String s[])
{
int n,arm=0,a,temp;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(n>0)
{
a=n%10;
arm+=a*a*a;
n/=10;
}
if(temp==arm)
System.out.println(arm+"it is a armstrong number");
else
System.out.println(arm+"it is not a armstrong number");
}
} 
