package HomeWorkCourse1.CourseWork1.hard;

public class Main {


    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook(10);
        employeeBook.addEmployee(new Employee("Иванов Иван Иванович 1", 1, 50000));
        employeeBook.addEmployee(new Employee("Иванов Иван Иванович 2", 2, 60000));
        employeeBook.addEmployee(new Employee("Иванов Иван Иванович 3", 3, 10000));
        employeeBook.addEmployee(new Employee("Иванов Иван Иванович 4", 4, 80000));
        employeeBook.addEmployee(new Employee("Иванов Иван Иванович 5", 5, 90000));
        employeeBook.addEmployee(new Employee("Иванов Иван Иванович 6", 1, 20000));
        employeeBook.addEmployee(new Employee("Иванов Иван Иванович 7", 2, 30000));
        employeeBook.addEmployee(new Employee("Иванов Иван Иванович 8", 3, 40000));
        employeeBook.addEmployee(new Employee("Иванов Иван Иванович 9", 4, 70000));
        employeeBook.addEmployee(new Employee("Иванов Иван Иванович 10", 5, 100000));


        employeeBook.listOfEmployees(1);

        employeeBook.monthlySalaryExpenses(2);

        employeeBook.minSalary(3);

        employeeBook.maxSalary(4);

        employeeBook.averageSalary(5);

        employeeBook.salaryIndexing(2, 100);

        employeeBook.employeesWithSalaryLessThenNumber(50000);

        employeeBook.employeesWithSalaryMoreThenNumber(50000);

        employeeBook.deleteEmployee(1);

        employeeBook.listOfEmployees(1);

        employeeBook.addEmployee(new Employee("Петров Петр Петрович", 1, 75000));

        employeeBook.listOfEmployees(1);

        employeeBook.getAllEmployeesByDepartment();

        employeeBook.changeEmployeeDepartment("Сергеев Сергей Сергеевич", 50000, 2);
    }
}
