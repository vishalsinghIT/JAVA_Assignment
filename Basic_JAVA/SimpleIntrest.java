import java.util.*;
public class SimpleIntrest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double  SI,P,T,R;
        System.out.println("Enter the value of x anf y");
        P=sc.nextDouble();
        T=sc.nextDouble();
        R=sc.nextDouble();
        SI=(P*T*R)/100;
        System.out.println("The Simple Intrest " +SI);
        sc.close();
    }
}
