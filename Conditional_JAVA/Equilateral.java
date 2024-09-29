package Conditional_JAVA;

import java.util.*;
public class Equilateral {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a;
        System.out.println("Enter the value of a");
        a=sc.nextDouble();
        double A=(Math.sqrt(3)/4*(a*a));
        System.out.println("The area is " +A);
        sc.close();
    }
}
