public class Person {
    //поля name, age, домашний адрес (использовать для этого класс Address)
    //и рабочий адрес (тоже использовать Address).
    private String name; // имя
    private int age; //   возраст
    private Address adres;// домашний адрес
    private Address adres_work; // рабочий адрес

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Address adres, Address adres_work) {
        this.name = name;
        this.age = age;
        this.adres = adres;
        this.adres_work = adres_work;
    }

    private void Address_home(Person a) {
        System.out.println(a.adres);
    }

    public void Address_work(Person a) {
     a.adres_work.Address_full(adres_work);

    }
}
