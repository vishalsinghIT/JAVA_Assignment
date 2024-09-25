import java.util.*;
public class Largest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the value of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        if(x>y)
        {
            System.out.println("The largest number is "+x);
        }else
        {
            System.out.println("The largest number is "+y);
        }
        sc.close();
    }
}
