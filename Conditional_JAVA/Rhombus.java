package Conditional_JAVA;

import java.util.*;
public class Rhombus {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double d1,d2;
        System.out.println("ENTRT THE VALIUE OF D1 AND D2");
        d1=sc.nextDouble();
        d2=sc.nextDouble();
        double area=(d1*d2)/2;
        System.out.println("Area is " +area);
        sc.close();
    }
}
