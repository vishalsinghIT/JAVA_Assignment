package Conditional_JAVA;

import java.util.*;
public class DisplayDigit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        while (n>0)
         {
            int r=n%10;
            n/=10;
            System.out.println(r);
            sc.close();
        }
    }
}
