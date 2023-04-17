import java.util.*;

public class loops
{
    public static void main(String[]args) {
        //arithematic progression
        System.out.println("Enter the first term");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.println("Enter the difference");
        double d = sc.nextDouble();
        
        System.out.println("Enter the last term");
        double n = sc.nextDouble();
        double sum = 0;

        for(double i = a; i <= n; i = i + d) {
            sum = sum + i;
        }
        System.out.print("Your sum is ");
        System.out.println(sum);
    }    
}