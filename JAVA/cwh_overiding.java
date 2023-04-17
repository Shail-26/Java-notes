class overriding {
    public int a;
    public int harry(){
        return 1;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class A extends overriding {
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}

public class cwh_overiding {
    public static void main(String[] args) {
        overriding o = new overriding();
        o.meth2();

        A a = new A();
        a.meth2();
    }
}
