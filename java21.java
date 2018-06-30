import java.io.*;
import java.util.*;
public class java21
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int d=sc.nextInt();
        int t=0,k=1;
        for(int i=1;i<=n-1;i++)
        {
            t+=a+(k*d);
            k++;
        }
        System.out.print(a+t);
    }
}


