public class Main {

    public static void printSeparation(){
        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        System.out.println("Куровая работа. Практическое задание.\n");
        EmployeeBook employeeBook = new EmployeeBook();

        printSeparation();

        employeeBook.printEmployees();

        printSeparation();

        System.out.println("\nnemployeeBook.calculateTotalSalary() = "
                + employeeBook.calculateTotalSalary());

        System.out.println("employeeBook.findEmployeeMinSalary() = "
                + employeeBook.findEmployeeMinSalary());

        System.out.println("employeeBook.findEmployeeMaxSalary() = "
                + employeeBook.findEmployeeMaxSalary());

        System.out.println("employeeBook.calculateAvengerSalary() = "
                + employeeBook.calculateAvengerSalary());

        printSeparation();

        employeeBook.printFullName();

        printSeparation();

        employeeBook.increaseSalary(10);

        employeeBook.printEmployees();

        printSeparation();

        System.out.println("\nemployeeBook.findEmployeeMinSalaryOfDeportament(2) = "
                + employeeBook.findEmployeeMinSalaryOfDeportament(2));

        System.out.println("employeeBook.findEmployeeMaxSalaryOfDeportament(1) = "
                + employeeBook.findEmployeeMaxSalaryOfDeportament(1));

        System.out.println("employeeBook.calculateAvengerSalaryOfDeportament(3) = "
                + employeeBook.calculateAvengerSalaryOfDeportament(3));

        System.out.println("employeeBook.calculateTotalSalaryOfDeportament(1) = "
                + employeeBook.calculateTotalSalaryOfDeportament(1));

        printSeparation();

        employeeBook.printEmployeesOfDeportament(3);

        employeeBook.printEmploeeWithLassSalaryThan(50000);

        employeeBook.printEmploeeWithMoreSalaryThan(50000);

        employeeBook.getNewEmployee("Онегин Виктор Геннадьевич", 3, 61000);

        printSeparation();

        employeeBook.printEmployees();

        employeeBook.deleteEmploee("Ковалев", 5);

        printSeparation();

        employeeBook.printEmployees();

        employeeBook.replaceEmploeeDeportament("", 2, 2);

        printSeparation();

        employeeBook.printEmployees();

        employeeBook.replaceEmploeeSalary("", 2, 80000);

        printSeparation();

        employeeBook.printEmployees();

        printSeparation();

        employeeBook.printEmployeeByDeportaments();
    }


}