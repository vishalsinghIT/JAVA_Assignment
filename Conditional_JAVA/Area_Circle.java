package Conditional_JAVA;

import java.util.*;
public class Area_Circle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double radius;
        System.out.println("Enter the value of radius is ");
        radius=sc.nextDouble();
        double Area=Math.PI*radius*radius;  
        System.out.println("The area of triangle is " +Area);
        sc.close();
    }
}
