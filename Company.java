public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
    
        employees[0] = new Employee("Rafał Nowak", 4500.00);
        employees[1] = new Employee("Adam Gabacki", 5000.00);
        employees[2] = new Employee("Katarzyna Nowicka", 3200.00);
        employees[3] = new Employee("Michał Babacki", 3600.00);
        employees[4] = new Employee("Martyna Witkowska", 3700.00);

        Employee thirdEmployee = employees[3];
        employees[3].setSalary(4100);

        System.out.println(thirdEmployee);

    }





}