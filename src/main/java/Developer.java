public class Developer extends Employee {
    private  String developerPosition;
    public Developer(String name, int ID, int salary, String developerPosition) {
        super(name, ID, salary);
        this.developerPosition = developerPosition;
    }
    @Override
    public double calculateBonus() {
        if(this.developerPosition == "basic"){
            return getSalary() * 0.5;
        }
        else if (this.developerPosition == "intermediate"){
            return getSalary() * 0.7;
        }
        else if(this.developerPosition == "advance"){
            return getSalary() * 0.10;
        }
        else {
            throw new IllegalArgumentException("Invalid Developer Position, Must enter basic or intermediate or advance ");
        }
    }

}
