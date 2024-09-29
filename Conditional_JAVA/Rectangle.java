package Conditional_JAVA;

import java.util.*;
public class Rectangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double length,breadth;
        System.out.println("Enter the value of l and b");
        length=sc.nextDouble();
        breadth=sc.nextDouble();
        double area=length*breadth;
        System.out.println("The area of triangle " +area);
        sc.close();
    }
}
