public class sabito {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("my name is Roman");

        Sobaka Havchik = new Sobaka(2, 2);
        Sobaka Molka = new Sobaka(8, 4);
        Sobaka Valera = new Sobaka(10, 10);

        Havchik.pokormit(1);
        Havchik.pomit(2);
        Molka.pogladit(1);
        Valera.pomit(2);

        System.out.println("вес Хавчика " +  Havchik.ves + " " + "настроение " + Havchik.nastroenie);
        System.out.println("вес Мольки " + Molka.ves + " " + "настроение " + Molka.nastroenie);
        System.out.println("вес Валеры " +  Valera.ves + " " + "настроение " + Valera.nastroenie);
    }
}
