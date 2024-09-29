package Conditional_JAVA;

import java.util.*;
public class Fibonacci {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a+ " " +b+ " ,") ;
        for(int i=0; i<n-2; i++)
        {
         c=a+b;
         System.out.print(c+ " , ");
         a=b;
         b=c;  
        }
        sc.close();
    }
}
