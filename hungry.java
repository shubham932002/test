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
        }

        else if(s.equals("no"))
        {
            System.out.println("are u thirsty");
            String x=sc.nextLine();
            if(x.equals("yes"))
            {
                System.out.println("drink water");
                System.out.println("soda");
            }

        }
        else
        {
            System.out.println("do homeowrk");
        }

    }
}
