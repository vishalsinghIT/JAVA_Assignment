package Conditional_JAVA;

import java.util.*;
public class Triangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double base,height;
        System.out.println("Enter the value of base and height");
        base=sc.nextDouble();
        height=sc.nextDouble();
        double area=base*height;
        System.out.println("The area of trianbgle is "+area);
        
    }
}
