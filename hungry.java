import java.util.*;
public class hungry {
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Are u hungry?");
        String s= sc.nextLine();
        if(s.equals("yes"))
        {
            System.out.println("eat samosa");
            System.out.println("eat pizza");
            System.out.println("eat burger");
            System.out.println("eat fries");
        }

        else
        {
            System.out.println("do homeowrk");
            System.out.print("and get a good grade");
        }


    }
}
