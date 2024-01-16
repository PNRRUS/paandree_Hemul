public class Address {
    //поля страна, город, улица, номер дома, индекс
    private String country; // страна
    private String city; //   город
    private String street; //   улица
    private int house; // номер дома
    private int index; // почтовый индекс}

    public Address() {
    }

    public Address(String country) {
        this.country = country;
        }

    public Address(String country, String city, String street, int house, int index) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.index = index;
    }

    public void Address_full(Address a) {
        if (country != null) System.out.println(country);
        if (city != null) System.out.println(city);
        if (street != null) System.out.println(street);
        if (house != 0) System.out.println(house);
        if (index != 0) System.out.println(index);
    }

}