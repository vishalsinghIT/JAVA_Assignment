import java.util.*;
public class Sum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,sum=0;
        System.out.println("Enter the value of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        sum=x+y;
        System.out.println("The value of sum is "+sum);
        sc.close();
    }
}
