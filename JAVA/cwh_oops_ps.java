class Employee {
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

class cellPhone {
    public void ring(){
        System.out.println("Ringing....");
    }

    public void vibrate(){
        System.out.println("Vibrating....");
    }

    public void call(){
        System.out.println("Calling Nisar....");
    }
}

public class cwh_oops_ps {
    public static void main(String[] args) {

        //problem 1
        /*
        Employee shail = new Employee();
        shail.salary = 17000;
        shail.setName("shailMacwan");
        System.out.println(shail.getSalary());
        System.out.println(shail.getName());
         */

        //problem 2
        /*
        cellPhone iPhone = new cellPhone();
        iPhone.call();
        iPhone.vibrate();
        iPhone.ring();
         */

        //problem 3

    }
}
