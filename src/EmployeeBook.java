public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook() {
        this.employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 2, 67000);
        employees[1] = new Employee("Финашин Генадий Вечаславович", 1, 43000);
        employees[2] = new Employee("Графов Антон Викторович", 3, 54000);
        employees[3] = new Employee("Лютов Иннокентий геннадьевич", 3, 46000);
        employees[4] = new Employee("Коавлев Олег Николаевич", 2, 82000);
        employees[5] = new Employee("Климова Надежда Петровна", 5, 34000);
        employees[6] = new Employee("Абрамова Виктория Олеговна", 5, 66000);
        employees[7] = new Employee("Сверидов Николай Петрович", 1, 57000);
        employees[8] = new Employee("Коняхин Дмитрий Петрович", 4, 57000);
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public Employee findEmployeeMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public Employee findEmployeeMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalary < employee.getSalary()) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public float calculateAvengerSalary() {
        return calculateTotalSalary() / (float) employees.length;
    }

    public void printFullName() {
        System.out.println("\nСотрудники:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
        System.out.println("\n");
    }

    public void increaseSalary(int percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary((int) (employee.getSalary() * (1 + percent / 100f)));
            }
        }
    }

    public Employee findEmployeeMinSalaryOfDeportament(int deportament) {
        Employee result = null;
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDeportament() == deportament && minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public Employee findEmployeeMaxSalaryOfDeportament(int deportament) {
        Employee result = null;
        int minSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDeportament() == deportament && minSalary < employee.getSalary()) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public float calculateAvengerSalaryOfDeportament(int deportament) {
        int sum = 0;
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDeportament() == deportament) {
                    sum = sum + employee.getSalary();
                    counter++;
                }
            }
        }
        return sum / (float) counter;
    }

    public int calculateTotalSalaryOfDeportament(int deportament) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDeportament() == deportament) {
                    sum = sum + employee.getSalary();
                }
            }
        }
        return sum;
    }

    public void increaseSalaryOfDeportament(int deportament, int percent) {
        for (Employee employee : employees) {
            if (employee.getDeportament() == deportament) {
                employee.setSalary((int) (employee.getSalary() * (1 + percent / 100f)));
            }
        }
    }

    public void printEmployeesOfDeportament(int deportament) {
        System.out.println("\nСотрудники " + deportament + " отдела:");
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDeportament() == deportament) {
                    System.out.println(employee.id + ". ФИО: " + employee.getName() + " Зарплата: "
                            + employee.getSalary());
                }
            }
        }
    }

    public void printEmploeeWithLassSalaryThan(int salary) {
        System.out.println("\nСотрудники с зарплатой меньше " + salary + "р.:");
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < salary) {
                    System.out.println(employee);
                }
            }
        }
    }

    public void printEmploeeWithMoreSalaryThan(int salary) {
        System.out.println("\nСотрудники с зарплатой больше " + salary + "р.:");
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() >= salary) {
                    System.out.println(employee);
                }
            }
        }
    }

    public void getNewEmployee(String name, int deportament, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(name, deportament, salary);
                break;
            }
        }
    }

    public void deleteEmploee(String name, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getName()) || id == employees[i].getId()) {
                employees[i] = null;
                break;
            }
        }
    }

    public void replaceEmploeeDeportament(String name, int id, int deportament) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getName()) || id == employees[i].getId()) {
                employees[i].setDeportament(deportament);
                break;
            }
        }
    }

    public void replaceEmploeeSalary(String name, int id, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getName()) || id == employees[i].getId()) {
                employees[i].setSalary(salary);
                break;
            }
        }
    }

    public void printEmployeeByDeportaments() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nСотрудники " + i + " отдела:");
            for (Employee employee : employees) {
                if (employee != null) {
                    if (employee.getDeportament() == i) {
                        System.out.println(employee.getName());
                    }
                }
            }
        }
    }
}

