import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];
    
        employees[0] = new Manager("Rafał Nowak", 4500.00,0);
        employees[1] = new Worker("Adam Gabacki", 5000.00,"HR Specialist");
        employees[2] = new Employee("Katarzyna Nowicka", 3200.00);
        employees[3] = new Employee("Michał Babacki", 3600.00);
        employees[4] = new Worker("Teresa Witkowska", 3700.00,"Developer");
        employees[5] = new Manager("Stefan Kowalski", 5500, 0);
        employees[6] = new Worker("Jakub Gagacki", 3900, "Developer");



        Employee thirdEmployee = employees[3];

        employees[3].setSalary(4100);


        for (Employee emp : employees) {
            emp.setSalary(emp.getSalary() + 500);
        }



        int nonManagerCount = 0;

        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                nonManagerCount++;
            }
        }

        for(Employee emp: employees){
            if (emp instanceof Manager) {
                ((Manager) emp).setNumberOfSubordinates(nonManagerCount);
                ((Manager) emp).setSalary(7500.00);
            }
        }
        



        System.out.println("All employees:");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
   
    }


    }

}