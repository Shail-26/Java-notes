public class cwh_methods {
    int logic(int x, int y) {
        int z ;
        if(x>y) {
            z = x+y;
        }
        else {
            z = (x+y)*2;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 7;
        int c;
        cwh_methods obj = new cwh_methods();
        c = obj.logic(a, b);
        System.out.println(c);

        int p = 5;
        int q = 21;
        int r;
        r = obj.logic(p, q);
        System.out.println(r);
    }
}
