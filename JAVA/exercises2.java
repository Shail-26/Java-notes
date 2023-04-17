import java.net.http.HttpHeaders;
import java.util.*;

public class exercises2 {

    public static int raise(int x, int n) {
     int result = 1;
     //loops
     for(int i = 0; i < n; i++) {
        result = result * x;

     }  
      
     return result;
    }

    public static void main(String[]args) {
        System.out.println("Enter x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();

        System.out.println("The answer is : "+raise(x, n));

    }
}