import java.io.*;
import java.util.*;
public class java19
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int prod=1;
for(int i=1;i<=n;i++)
{
prod*=i;
}
System.out.print(prod);
}
}
