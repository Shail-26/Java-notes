import java.util.*;

public class cwh_recursion {

//    static int factorial(int n) {
//        if (n==0 || n==1) {
//           return 1;
//        }
//        else {
//            return n * factorial(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int x = sc.nextInt();
//
//        System.out.println(factorial(x));
//    } 0 1 1 2 3 5 8 13 21 34 . . . . . . .

    static int fibo(int n) {
        if(n <= 1) {
            return n;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int x = sc.nextInt();

       for(int i = 0; i < x; i++) {
           System.out.print(fibo(i) + " ");
       }
    }
}
