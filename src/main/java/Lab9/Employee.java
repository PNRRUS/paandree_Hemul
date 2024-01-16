package Lab9;

public class Employee {

    private String Name; //   имя
    private String Surname; //   фамилия
    private int Salary; // заработная плата


    public Employee(String name, String Surname, int salary) {
        this.Name = name;
        this.Surname = Surname;
        this.Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        if (salary > 0)
            this.Salary = salary;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String toString() {
        return "Employee Name=" + Name
                + ", employeeSurname=" + Surname
                + ", employeeSalary=" + Salary;

    }

}
