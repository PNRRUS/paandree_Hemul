package Lab9;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Comparator;

public class Lab_9_1 {

    public static void main(String[] args) {
        //I.
        /*
        1) Создайте класс Employee с полями Name, Surname, Salary и соотвествующими сеттерами, геттерами
        и конструктором инициализирующим все поля, перегрузите метод toString

        2) Создайте класс Company с коллекцией(тип коллекции на ваше усмотрение) сотрудников.
        Предоставте методы для добавления и удаления сотрудников в коллецию,а так же для вывода информации
        о всех сотрудников в консоль.
        Предоставьте необходимыые конструкторы(как минимум коллекцию надо инициализировать).
        Заполните коллекцию с сотрудниками минимум 5 записями.

        3) Дополните класс Company коллекцией слоганов компании. Слоганы должны быть уникальны.
        Предоставьте методы для добавления и получения слогонов

        4) Дополните класс Company коллекцией автомобилей (можно не создавать отдельный класс,
        достаточно строки-названия авто).
        Каждому автомобилю соотвествует уникальный гос. номер (А999АА78 и т.д.).
        Добавьте методы для внесения автомобилей в коллекцию,
        а так же метод для получения автомобиля по его номеру. Добавьте несколько автомобилей
         */

        Employee e1 = new Employee("Ivan", "Ivanov", 1000);
        Employee e2 = new Employee("Petr", "Petrov", 2000);
        Employee e3 = new Employee("Sidr", "Sidorov", 500);
        Employee e4 = new Employee("Andrei", "Andreev", 1500);
        Employee e5 = new Employee("Vladimir", "Vladimirov", 900);

        ArrayList<Employee> EmployeeList = new ArrayList<Employee>();

        Company firma = new Company();
        firma.addEmployee(e1, EmployeeList);
        firma.addEmployee(e2, EmployeeList);
        firma.addEmployee(e3, EmployeeList);
        firma.addEmployee(e4, EmployeeList);
        firma.addEmployee(e5, EmployeeList);

        firma.printEmployees(EmployeeList);
            /*Employee Name=Ivan, employeeSurname=Ivanov, employeeSalary=1000
            Employee Name=Petr, employeeSurname=Petrov, employeeSalary=2000
            Employee Name=Sidr, employeeSurname=Sidorov, employeeSalary=500
            Employee Name=Andrei, employeeSurname=Andreev, employeeSalary=1500
            Employee Name=Vladimir, employeeSurname=Vladimirov, employeeSalary=900*/

        ArrayList<String> CompanySlogans = new ArrayList<String>();

        firma.addSlogan("Да здравствует КПСС!", CompanySlogans);
        firma.addSlogan("Миру - мир!", CompanySlogans);

        firma.printSlogans(CompanySlogans);
        /*Да здравствует КПСС!
          Миру - мир!*/

        HashMap<String, String> CompanyCars = new HashMap<String, String>();
        firma.addCar("T234CE98", "Renault", CompanyCars);
        firma.addCar("D16TCE47", "Audi", CompanyCars);
        firma.addCar("T884PE47", "SKODA", CompanyCars);

        firma.findCar("D16TCE47", CompanyCars);
        /* Audi */

        //II.
        /*
         * 1) Напишите функциональный интерфейс который принимает две переменные типа double
         * и результатом работы которого будет так же тип double
         *
         * 2) Напишите несколько лямдб для вычисления площади геометрических фигур:
         * прямоугольника: сторона*сторона
         * треугольника: 0,5*основание*высота
         * круга: пи*радиус^2
         * выведите в консоль результат работы каждой из лямбд
         *
         * 3) Используйте StreamAPI для класса Company из предыдущей части выведите в консоль всех сотрудников,
         *  чья зарплата выше средней.
         *
         * 4) Используйте StreamAPI для класса Company из предыдущей части выведите сотрудника с минимальной зарплатой.
         *
         * 5) Используя StreamAPI выведите на консоль всех сотрудников отсортированных в естественном порядке (фамилия, имя)
         * */

        DoubleFunc RectangleSquare = (RectangleSide1, RectangleSide2) -> RectangleSide1 * RectangleSide2;
        System.out.println(RectangleSquare.calculate(2.1,5.3)); //11.3

        DoubleFunc TriangleSquare = (trianlgeBase, trianlgeHeigth) -> 0.5 * trianlgeBase * trianlgeHeigth;
        System.out.println(TriangleSquare.calculate(2.1,5.3)); //5.565

        DoubleFunc CircleSquare = (circleRadius, PI) -> PI * Math.pow(circleRadius,2);
        System.out.println(CircleSquare.calculate(2.1,Math.PI)); //13.8544..

        EmployeeList.stream().forEach(Employee->System.out.println(Employee.getSalary()));
        /*список всех ЗП
        1000
        2000
        500
        1500
        900 */

        System.out.println(EmployeeList.stream().min(Comparator.comparing(Employee::getSalary)).get());
        /*минимальная ЗП
        Employee Name=Sidr, employeeSurname=Sidorov, employeeSalary=500
         */

        EmployeeList.stream().filter(Employee->Employee.getSalary()>1000).forEach(System.out::println);
        /*ЗП больше 1000:
        Employee Name=Petr, employeeSurname=Petrov, employeeSalary=2000
        Employee Name=Andrei, employeeSurname=Andreev, employeeSalary=1500
         */
     }
}

@FunctionalInterface
interface DoubleFunc{
    double calculate(double n, double n1);
}