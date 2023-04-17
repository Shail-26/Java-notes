class myEmployee{
    private int id;
    private String name;

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setId(int i){
        this.id = i;
    }

    public int getId(){
        return id;
    }
}


public class cwh_modifiers {
    public static void main(String[] args) {
        myEmployee shail = new myEmployee();
        shail.setName("Shail");
        shail.setId(444);
        System.out.println(shail.getName() + " " + shail.getId());
    }
}
