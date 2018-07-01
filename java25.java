import java.io.*;
import java.util.*;
public class java25
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int t=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        if(n%2!=0)
        {
            System.out.print(a[n/2]);
        }
        else
        {
            t=a[n/2]+a[(n/2)-1];
            System.out.print(t/2);
        }
    }
}




