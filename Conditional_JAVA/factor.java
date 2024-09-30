package Conditional_JAVA;

import java.util.*;
public class factor {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            System.out.println(i);
        }
        sc.close();
    }
}
