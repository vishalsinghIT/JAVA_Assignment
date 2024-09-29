package Conditional_JAVA;

import java.util.*;
public class CountDigit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int count=0;
        while(n>0)
        {
           // int r=n%10;
           n/=10;
            count++;
        }
        System.out.println(count);
    }
}
