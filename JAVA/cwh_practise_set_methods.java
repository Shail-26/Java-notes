import java.util.*;

public class cwh_practise_set_methods {
    static void mul(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d\n", n, i, n*i);
        }
    }
    static int nat(int n) {
        if (n == 1) {
            return 1;
        }
        return (n*(n-1))/2;
    }

    static int avg(int ...arr) {
        int result = 0;
        for(int a:arr) {
            result += a;
        }
        return result/arr.length;
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int x = sc.nextInt();
//        mul(x);

//    public static void main(String[] args) {
//        int x = 4;
//        System.out.println(nat(x));
//}

    public static void main(String[] args) {
        System.out.println(avg(1,5,8,9,10,15,54,2,5,12,54,12,458,26,45,12,54,21,85,4));
    }

}
