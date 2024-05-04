import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
    
        employees[0] = new Manager("Rafał Nowak", 4500.00,0);
        employees[1] = new Worker("Adam Gabacki", 5000.00,"HR Specialist");
        employees[2] = new Employee("Katarzyna Nowicka", 3200.00);
        employees[3] = new Employee("Michał Babacki", 3600.00);
        employees[4] = new Worker("Teresa Witkowska", 3700.00,"Developer");

        Employee thirdEmployee = employees[3];

        employees[3].setSalary(4100);



        int nonManagerCount = 0;

        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                nonManagerCount++;
            }
        }


        if (employees[0] instanceof Manager) {
            ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);
            ((Manager) employees[0]).setSalary(7500.00);
        }



        System.out.println("All employees:");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
   
    }


    }

}