package Conditional_JAVA;

import java.util.*;
public class Average {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        double sum=0;
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the number" +(i+1)+ " : ");
            double number=sc.nextDouble();
            sum+=number;
        }
        double avg=sum/n;
        System.out.println("Average is " +avg);
        sc.close();
    }
}
