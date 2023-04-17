public class cwh_varargs {
    static int foo(int ...arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(foo(1,2,3,4,5,6,7,8,9,10));

    }
}
