class Employee1 {
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+name);
    }

    public int getSalary(){
        return salary;
    }
}


public class cwh_oops_class {
    public static void main(String[] args) {
        Employee1 harry = new Employee1();
        Employee1 shail = new Employee1();

        harry.id = 17;
        harry.name = "Harry Potter";

        shail.id = 25;
        shail.name = "Shail Macwan";
        shail.salary = 340000;

        System.out.println(shail.getSalary());

    }
}
