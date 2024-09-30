package Conditional_JAVA;

import java.util.*;
public class ProSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int sum=0;
        int mul=1;
        while (n>0)
         {
            int r=n%10;
            sum=sum+r;
            mul=mul*r;
            n/=10;
        }
        System.out.println("The sum is " +sum);
        System.out.println("The product is "+mul);
        int sub= mul-sum;
        System.out.println("Result is " +sub);
        sc.close();
    }
}
