import java.util.*;
public class hungry {
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Are u hungry?");
        String s= sc.nextLine();
        if(s.equals("yes"))
            System.out.println("eat pizza");
        else
            System.out.println("do your homework");
    }
}
