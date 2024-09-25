import java.util.*;
public class EvenOdd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        if(n%2==2)
        {
            System.out.println("Number is Even ");
        }else{
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
