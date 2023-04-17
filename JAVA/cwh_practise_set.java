class sphere {
    private int radius;
    private int area;
    private int volume;


    public sphere(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return (4/3) * Math.PI * radius * radius * radius;
    }
}

public class cwh_practise_set {
    public static void main(String[] args) {
        sphere mySphere = new sphere(3);

        System.out.println(mySphere.getArea());
        System.out.println(mySphere.getVolume());
    }
}
