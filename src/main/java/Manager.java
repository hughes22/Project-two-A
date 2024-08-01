public class Manager extends Employee {
    private String managerPosition;
        public Manager(String name, int ID, int salary, String managerPosition) {
            super(name, ID, salary);
            this.managerPosition = managerPosition;
        }
        @Override
    public double calculateBonus() {
        if(this.managerPosition == "HR"){
            return getSalary() * 0.12;
        }
        else if (this.managerPosition == "General Manager"){
            return getSalary() * 2;
        }
        else if(this.managerPosition == "Accountant"){
            return getSalary() * 0.15;
        }
        else {
            throw new IllegalArgumentException("Invalid Manger Position, Must enter HR or General Manager or Accountant ");
        }
    }
    }

