import java.util.*;
public class Average {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A,B,C;
        System.out.println("Enter the value of A B and C");
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        int Avg=(A+B+C/3);
        System.out.println("The Average is "+Avg);
        sc.close();
    }
}
