import java.io.*;
import java.util.*;
public class java22
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if((Character.isDigit(s.charAt(i)))||(s.charAt(i)=='.'))
            {
                c++;
            }
        }
        if(c==s.length())
        {
            System.out.print("yes");
        }
        else
        System.out.print("no");
    }
}




