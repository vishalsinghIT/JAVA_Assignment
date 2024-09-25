import java.util.*;
public class INRtoUSD {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double INR,USD;
        System.out.println("Enter the Value of USD");
        USD=sc.nextDouble();
        INR=(USD/0.012);
        System.out.println("The INR is " +INR);
        sc.close();
        
    }
}
