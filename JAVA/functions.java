import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class functions {
    public static int table(int a) {
        //loops
        int product = 1;
        for(int i=1; i<=10; i++) {
            product = i * a;
            System.out.println(a+" * "+i+" = "+product);
        }
        return 1;
        
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        table(a);

    }
}