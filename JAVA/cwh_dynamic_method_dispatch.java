class phone{
    public void time(){
        System.out.println("The current time is 8 AM ");
    }
    public void start(){
        System.out.println("Turning on the Phone");
    }
}
class smartPhone extends phone{
    public void music(){
        System.out.println("This smartphone is playing...");
    }
    public void start(){
        System.out.println("Turning on the smartphone");
    }
}


public class cwh_dynamic_method_dispatch {
    public static void main(String[] args) {
        phone S21 = new smartPhone();

        S21.time();
        S21.start();
    }
}
