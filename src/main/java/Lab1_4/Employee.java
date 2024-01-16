public class Employee {
   //  Employee: name, position, salary

    private String name; //   имя
    private String position; //   должность
    private int salary; // заработная плата


    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0)
        this.salary = salary;
    }
}
