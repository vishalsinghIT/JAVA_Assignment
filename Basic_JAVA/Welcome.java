import java.util.*;
public class Welcome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Welcome to my home "+name);
        sc.close();
    }
}
