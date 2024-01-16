public class Company {
    //1) Cоздайте классы Company и Employee. Для Company добавить: name, address, sphere,
    //сотрудники (массив из Employee).

    private String name; //   название компании
    private String address; //   адрес
    private String sphere; //   сфера деятельности
    private Employee[] employees; // список сотрудников

    public Company(String name, String address, String sphere, Employee[] employees) {
        this.name = name;
        this.address = address;
        this.sphere = sphere;
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    private String Position_Name(String position_employee) {

        String Name = "";
        for (int i = 0; i < employees.length; i++) {
            if (position_employee == employees[i].getPosition()) {
                Name = employees[i].getName();
            }
        }
        System.out.println(Name);
        return Name;
    }

    protected String CEO_Name() {
        String Name1 = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getPosition() == "CEO") {
                Name1 = employees[i].getName();
            }
            break;
        }
        System.out.println(Name1);
        return Name1;
    }

    public String CEO_Name_public() {
        String Name2 = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getPosition() == "CEO") {
                Name2 = employees[i].getName();
            }
            break;
        }
        return Name2;
    }

    public int[] Salary_average_max() {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }

        }
        return new int[]{sum / employees.length, max};
    }


}
