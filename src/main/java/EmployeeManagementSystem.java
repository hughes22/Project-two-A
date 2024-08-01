public class EmployeeManagementSystem {
        public static void main(String[] args) {
            Employee[] employees = {
                    new Manager("Albert",001,1000, "HR"),
                    new Developer("Ama",011,300,"basic"),
            };
            for (Employee employee : employees) {
                System.out.println(employee.getName() + " ID " + employee.getID() + " Salary " + employee.getSalary() + " " + "Bonus:  " + employee.calculateBonus());

            }
        }
    }

