import java.io.*;
import java.util.*;
public class java18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int arm=0;
        int t=0,s=0,r=0;
        for(int i=n;i<=n1;i++)
        {
            t=i;
            s=0;
            while(t>0)
            {
                r=t%10;
                s+=r*r*r;
                t=t/10;
            }
            if(s==i)
            {
                System.out.print(s+" ");
            }
        }
    }
}



