package Conditional_JAVA;

import java.util.*;
public class ArmStrong {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int sum=0;
        int m=n;
        while(n>0)
        {
            int r=n%10;
            sum= sum+ r*r*r;
            n/=10;
        }
        System.out.println(sum);
        if(sum==m)
        {
            System.out.println("Armstrong Number ");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
