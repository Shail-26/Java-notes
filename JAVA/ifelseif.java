import java.util.*;
import java.lang.Math;
import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class ifelseif {
    public static void main(String[]args) {
        System.out.println("What would you like to do:\n1)Sum, Difference, Multiply, Divide, Remainder\nOR\n2)Sqrt, Square");

        Scanner sc = new Scanner(System.in);
        int firstoption = sc.nextInt();

        switch(firstoption) {
        case 1: System.out.println("What would you like to do:\n1)SUM(+)\n2)DIFFERENCE(-)\n3)MULTIPLY(*)\n4)DIVIDE(/)\n5)REMAINDER(%)");
         double button = sc.nextDouble();
         if(button == 1) {
            System.out.println("Enter your first integer");
               
            double a = sc.nextDouble();
            System.out.println("Enter your second integer");
               
            double b = sc.nextDouble();
            
            double SUM = a + b;
            System.out.print("Your sum is ");
            System.out.println(SUM);

         } else if(button == 2) {
            System.out.println("Enter your first integer");
               
            double a = sc.nextDouble();
            System.out.println("Enter your second integer");
               
            double b = sc.nextDouble();
            
            double DIFF = a - b;
            System.out.print("Your difference is ");
            System.out.println(DIFF);
         } else if(button == 3) {
            System.out.println("Enter your first integer");
               
            double a = sc.nextDouble();
            System.out.println("Enter your second integer");
               
            double b = sc.nextDouble();
            
            double MUL = a * b;
            System.out.print("Your multiplication is ");
            System.out.println(MUL);
         } else if(button == 4) {
            System.out.println("Enter your first integer");
               
            double a = sc.nextDouble();
            System.out.println("Enter your second integer");
               
            double b = sc.nextDouble();
            if(b==0) {
               System.out.println("Error occured");
            }
            else {
            double DIVIDE = a / b;
            System.out.print("Your dividation is ");
            System.out.println(DIVIDE);
            }
         } else if(button == 5) {
            System.out.println("Enter your first integer");
               
            double a = sc.nextInt();
            System.out.println("Enter your second integer");
               
            double b = sc.nextDouble();
            if(b==0) {
               System.out.println("Error occured");
            } else {
            double REM = a % b;
            System.out.print("Your remainder is ");
            System.out.println(REM);
            }
         } else {
            System.out.println("Invalid Option");
         }

        break;
        case 2: System.out.println("What would you like to do:\n1)Sqrt\n2)Square");
            
         int button2 = sc.nextInt();
         if(button2 == 1) {
            System.out.println("Enter your integer");
               
            double a = sc.nextDouble();
            
            System.out.print("Your square root is ");
            System.out.println(Math.sqrt(a));

         } else if(button2 == 2) {
            System.out.println("Enter your integer");
               
            double a = sc.nextDouble();
            
            double sq2 = a * a;
            System.out.print("Your square is ");
            System.out.println(sq2);
         } else{
            System.out.println("Invalid option");
         }
        break;
        }
    }
}