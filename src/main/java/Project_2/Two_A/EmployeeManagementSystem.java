package Project_2.Two_A;

public class EmployeeManagementSystem {
        public static void main(String[] args) {
            Employee[] employees = {
                    new Manager("Albert",610,1000, "HR"),
                    new Developer("Ama",612,600,"advance")
            };
            for (Employee employee : employees) {
                System.out.println(employee.getName() + " ID " + employee.getID() + " Salary " + employee.getSalary() + " " + "Bonus:  " + employee.calculateBonus());

            }
        }
    }

