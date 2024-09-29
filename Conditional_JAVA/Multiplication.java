package Conditional_JAVA;

import java.util.*;
public class Multiplication {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(int i=1; i<=20; i++)
        {
            int mul= n*i;
            System.out.println(n+ " x " +i+ " = " +mul);
            
        }
    }
}
