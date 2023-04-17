class Base1 {
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x) {
        System.out.println("I am a constructor no. 1");
    }
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x,int y) {
        super(x);
        System.out.println("I am a overloaded constructor of derived class");
    }
}

public class cwh_constructors_inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1();
        Derived1 dc = new Derived1(14,9);

    }
}
