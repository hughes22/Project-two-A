package A;

public class Employee {

    private String name;
    private int ID;
    private int salary;


    public Employee(String name, int ID, int salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public double calculateBonus(){
        return 0.0;
    }
}








