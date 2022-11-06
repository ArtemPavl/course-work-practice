public class Employee {

    private final String name;
    private int deportament;
    private int salary;
    public int id;
    private static int counter = 1;
    //Добавить в класс Employee поле id,
    // которое проставляется из счетчика, а затем счетчик увеличивает свое значение. ?????

    public Employee(String name, int branch, int salary){
        ;
        this.name = name;
        this.deportament = branch;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName(){
        return this.name;
    }

    public int getDeportament(){
        return this.deportament;
    }

    public int getSalary(){
        return this.salary;
    }

    public int getId(){
        return this.id;
    }

    public int getCounter(){
        return counter;
    }

    public int setDeportament(int branch){
        this.deportament = branch;
        return this.deportament;
    }

    public int setSalary(int salary){
        this.salary = salary;
        return this.salary;
    }

    @Override
    public String toString() {
        return id + ". ФИО: " +  name + " Отдел: " + deportament +
                " Зарплата: " + salary + "р.";
    }
}
