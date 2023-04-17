public class cwh_method_overloading {
    static void foo() {
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a) {
        System.out.println("Good Morning "+a+" Bro!");
    }

    public static void main(String[] args) {
        foo();
        foo(Integer.MAX_VALUE);
    }
}
