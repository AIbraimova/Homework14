public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation){
        this.name = name;
        this.designation=designation;}
    public Person (){}

    public void walk(){
        System.out.println("Walk");
    }
    public void eat(){
        System.out.println("Eat");
    }
    public void learn(){
        System.out.println("Learn");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String toString(){
        return name+"  is "+designation;
    }
}
