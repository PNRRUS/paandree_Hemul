package Lab9;
import java.util.ArrayList;
import java.util.HashMap;

public class Company {
    Employee x;
    String Slogan;
    ArrayList<Employee> EmployeeList;
    ArrayList<String> CompanySlogans;
    String carBrand;
    String carNumber;
    HashMap<String,String> EmployeeCars;

    public Company() {
    }

    public Company(Employee x, ArrayList<Employee> employeeList) {
        this.x = x;
        EmployeeList = employeeList;
    }

    public Company(String slogan, ArrayList<String> companySlogans) {
        Slogan = slogan;
        CompanySlogans = companySlogans;
    }

    public Company(String carNumber, String carBrand, HashMap<String, String> employeeCars) {
        this.carNumber = carNumber;
        this.carBrand = carBrand;
        EmployeeCars = employeeCars;
    }

    public void addEmployee(Employee x, ArrayList<Employee> EmployeeList) {
        EmployeeList.add(x);
    }

    public void delEmployee(Employee x, ArrayList<Employee> EmployeeList) {
        EmployeeList.remove(x);
    }

    public void printEmployees(ArrayList<Employee> EmployeeList) {
        for (Employee emp : EmployeeList) {
            System.out.println(emp);
        }
    }

    public void addSlogan(String Slogan, ArrayList<String> CompanySlogans) {
        CompanySlogans.add(Slogan);
    }

    public void printSlogans(ArrayList<String> CompanySlogans) {
        for (String s : CompanySlogans) {
            System.out.println(s);
        }
    }

    public void addCar(String carNumber, String carBrand, HashMap<String,String> CompanyCars) {
        CompanyCars.put(carNumber,carBrand);
    }

    public void findCar(String carNumber, HashMap<String,String> CompanyCars) {
                    System.out.println(CompanyCars.get(carNumber));
            }
}
