public class Medium {

    public static Employee[] employees = new Employee[10];
    public static void printEmployees(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static void increaseSalary(int percent){
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary() * (1 + percent/100f)));
        }
    }

    public static Employee findEmployeeMinSalaryOfDeportament(int deportament){
        Employee result = null;
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getDeportament() == deportament) {
                if (minSalary > employee.getSalary()){
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public static Employee findEmployeeMaxSalaryOfDeportament(int deportament){
        Employee result = null;
        int minSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getDeportament() == deportament) {
                if (minSalary < employee.getSalary()){
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public static float calculateAvengerSalaryOfDeportament(int deportament) {
        int sum = 0;
        int counter = 0;
        for (Employee employee : employees) {
            if (employee.getDeportament() == deportament) {
                sum = sum + employee.getSalary();
                counter++;
            }
        }
        return sum / (float) counter;
    }

    public static int calculateTotalSalaryOfDeportament(int deportament) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDeportament() == deportament) {
                sum = sum + employee.getSalary();
            }
        }return sum;
    }

    public static void increaseSalaryOfDeportament(int deportament, int percent){
        for (Employee employee : employees) {
            if (employee.getDeportament() == deportament) {
                employee.setSalary((int) (employee.getSalary() * (1 + percent / 100f)));
            }
        }
    }
    public static void printEmployeesOfDeportament(int deportament){
        System.out.println("\nСотрудники " + deportament + " отдела:");
        for (Employee employee : employees) {
            if (employee.getDeportament() == deportament) {
                System.out.println(employee.id + ". ФИО: " + employee.getName() + " Зарплата: "
                        + employee.getSalary());
            }
        }
    }

    public static void printEmploeeWithLassSalaryThan(int salary){
        System.out.println("\nСотрудники с зарплатой меньше " + salary + "р.:");
        for (Employee employee : employees) {
            if(employee.getSalary() < salary){
                System.out.println(employee);
            }
        }
    }

    public static void printEmploeeWithMoreSalaryThan(int salary){
        System.out.println("\nСотрудники с зарплатой больше " + salary + "р.:");
        for (Employee employee : employees) {
            if(employee.getSalary() >= salary){
                System.out.println(employee);
            }
        }
    }

    public static void main (String[] agrs){
        System.out.println("Повышенный уровень\n");

        employees[0] = new Employee("Иванов Иван Иванович", 2, 67000);
        employees[1] = new Employee("Финашин Генадий Вечаславович", 1, 43000);
        employees[2] = new Employee("Графов Антон Викторович", 3, 54000);
        employees[3] = new Employee("Лютов Иннокентий геннадьевич", 3, 46000);
        employees[4] = new Employee("Коавлев Олег Николаевич", 2, 82000);
        employees[5] = new Employee("Климова Надежда Петровна", 5, 34000);
        employees[6] = new Employee("Абрамова Виктория Олеговна", 5, 66000);
        employees[7] = new Employee("Сверидов Николай Петрович", 1, 57000);
        employees[8] = new Employee("Кривопалов Алексей Семненович", 4, 73000);
        employees[9] = new Employee("Евлеева Анна Николаевна", 4, 39000);

        increaseSalary(10);
        printEmployees();
        System.out.println("\nfindEmployeeMinSalaryOfDeportament(1) = "
                + findEmployeeMinSalaryOfDeportament(1));
        System.out.println("findEmployeeMaxSalaryOfDeportament(2) = "
                + findEmployeeMaxSalaryOfDeportament(2));
        System.out.println("calculateTotalSalaryOfDeportament(3) = "
                + calculateTotalSalaryOfDeportament(3));
        System.out.println("calculateAvengerSalaryOfDeportament(4) = "
                + calculateAvengerSalaryOfDeportament(4) + "\n");
        increaseSalaryOfDeportament(5, 15);
        printEmployees();
        printEmployeesOfDeportament(1);
        printEmploeeWithLassSalaryThan(50000);
        printEmploeeWithMoreSalaryThan(50000);

    }

}
