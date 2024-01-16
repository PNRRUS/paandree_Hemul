public class Lab4 {

   /* Задание 1

            1) Создать класс Address (есть поля страна, город, улица, номер дома, индекс) и класс Person,
            у которого есть поля name, age, домашний адрес (использовать для этого класс Address)
            и рабочий адрес (тоже использовать Address).
            2) Добавить в оба класса конструкторы (в каждый класс несколько конструкторов,
            т.к. не всегда мы знаем всю информацию, может быть полезен и минималистичный конструктор
            с одним параметром или вовсе без параметров).
            3) Добавить следующие методы:
            • в классе Address должен быть метод выводящий на экран полностью весь адрес
            (если какая-то информация не заполнена, то не выводить ее на экран
            (т.е. мы не должны видеть null в выведенной на экран информации)
            • методы, которые доступны только из класса Person для вывода на экран домашнего адреса;
            • общедоступный метод, который выводит адрес на экран рабочий адрес
            4) В отдельном классе (можно назвать Main или MyProgram, или как угодно еще,
            главное, чтобы в нем был метод main).
            5) Добавить 3 «реальных человека» (экземпляры класса Person), чтобы двое работали по одному адресу,
            а для 3-го человека мы знаем только страну, в которой он работает.
            6) Вывести на экран информацию, где работает каждый человек.*/

    public static void main(String[] args) {

        Address a1_home = new Address ("Russia", "Saint - Petersburg","Dybenko",124,193498);
        Address a2_home = new Address ("Russia", "Saint - Petersburg","Leninsky",95,188498);
        Address a12_work = new Address ("Russia", "Saint - Petersburg","Nevsky",42,195398);
        Address a3 = new Address ("Russia");

        Person man1 = new Person("Ivan",25, a1_home, a12_work);
        Person man2 = new Person("Petr",30, a2_home, a12_work);
        Person man3 = new Person("Vladimir",43, a3, a3);

        System.out.println("Man1"); man1.Address_work(man1);
        System.out.println("Man2"); man2.Address_work(man2);
        System.out.println("Man3"); man3.Address_work(man3);

        /* Задание 2

        1) Cоздайте классы Company и Employee. Для Company добавить: name, address, sphere,
            сотрудники (массив из Employee). Employee: name, position, salary
        2) Добавить в классах Company и Employee геттеры и сеттеры по необходимости.
        3) В классе Company написать:
        • вспомогательный метод (должен быть доступен только в самом классе), чтобы по должности была возможность
           найти сотрудника (предположим, что в наших компаниях должности не повторяются).
        • метод чтобы получить владельца компании (эта информация должны быть доступна только в классах-наследниках)
        • общедоступный метод, чтобы узнать кто руководит компанией (назвать можно и генеральным директор, и CEO,
            как вам удобнее).
        4) Добавить возможность получить максимальную и среднюю зарплату в компании.
        5) Создайте 3 компании («T-Systems», «JetBrains», «Dell») с произвольным набором сотрудником
            (в каждой компании он различный).
        6) Вывести на экран максимальную и среднюю зарплату во всех компаниях.
*/
        Employee emp1 = new Employee("Ivan","CEO",5000);
        Employee emp2 = new Employee("Petr","Manager",1000);
        Employee emp3 = new Employee("Maksim","Accountant",2000);
        Employee emp4 = new Employee("Maksim","Driver",500);
        Employee emp5 = new Employee("Elena","CEO",3000);
        Employee emp6 = new Employee("Fedor","Writer",1000);
        Employee emp7 = new Employee("Oleg","Security",1500);
        Employee emp8 = new Employee("Gennady","CEO",10000);
        Employee emp9 = new Employee("Georgy","Sales Manager",5000);
        Employee emp10 = new Employee("Oleg","Product Manager",7000);
        Employee emp11 = new Employee("Oleg","PR Manager",7000);

        Employee[] company1  = {emp1, emp2, emp3, emp4};
        Employee[] company2  = {emp5, emp6, emp7};
        Employee[] company3  = {emp8, emp9, emp10, emp11};

        Company num1 = new Company("T-Systems","Spb, V.O., 13-Line, 14","Telekom", company1);
        Company num2 = new Company("JetBrains","Moscow, Arbat, 20","IT", company2);
        Company num3 = new Company("T-Systems","New York, 5-Avenue, 14","Computers", company3);

        System.out.println("Средняя_ЗП " + num1.Salary_average_max()[0]
                + " Максимальная_ЗП " + num1.Salary_average_max()[1]);
        System.out.println("Средняя_ЗП " + num2.Salary_average_max()[0]
                + " Максимальная_ЗП " + num2.Salary_average_max()[1]);
        System.out.println("Средняя_ЗП " + num3.Salary_average_max()[0]
                + " Максимальная_ЗП " + num3.Salary_average_max()[1]);





    }
}
