import java.util.*;

public class exercises {
    public static void main(String[]args) {
        int positive = 0, negetive = 0, zeros = 0;
        System.out.println("Press 1 to continue and 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        while(input == 1) {
            System.out.println("Enter your number : ");
            int number = sc.nextInt();

            if(number > 0) {
                positive++;
            }
            else if(number < 0) {
                negetive++;
            } 
            else {
                zeros++;
            }

            System.out.println("Press 1 to continue and 0 to stop");
            input = sc.nextInt();

        }
        
        System.out.println("Positive : "+positive);
        System.out.println("Negetive : "+negetive);
        System.out.println("Zeros : "+zeros);
        
    }
}