package Conditional_JAVA;

import java.util.*;
public class SumOfN {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum is " +sum);
        sc.close();
    }
}
