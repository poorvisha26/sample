import java.io.*;
import java.util.*;
public class java16
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int count=0;
        int j=0;
        for(int i=n;i<=n1;i++)
        {
            count=0;
            j=i;
            for(int k=1;k<=j;k++)
            {
            if(j%k==0)
            {
                count++;
            }
            }
            if(count==2)
            {
                System.out.print(i+" ");
            }
        }
    }
}

