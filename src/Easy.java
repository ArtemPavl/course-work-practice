public class Easy {
    public static Employee[] employees = new Employee[10];
    public static void printEmployees(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary(){
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeMinSalary(){
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()){
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeMaxSalary(){
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()){
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAvengerSalary() {
        return calculateTotalSalary() / (float) employees.length;
    }

    public static void printFullName(){
        System.out.println("\nСотрудники:");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }



    public static void main(String[] args) {
        System.out.println("Базовый уровень\n");

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

        printEmployees();
        System.out.println("\nСумма трат на зарплаты в месяц: " + calculateTotalSalary());
        System.out.println("Сотрудник с самой маленькой зарплатой: " + findEmployeeMinSalary());
        System.out.println("Сотрудник с самой большой зарплатой: " + findEmployeeMaxSalary());
        System.out.println("Средняя зарплата: " + calculateAvengerSalary());
        printFullName();
    }
}

