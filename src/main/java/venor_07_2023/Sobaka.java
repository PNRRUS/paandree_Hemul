public class Sobaka {

    int ves; // вес собаки
    int nastroenie; // настроение собаки

    // создание собаки по конкретным данным - конструктор
    public Sobaka(int ves, int nastroenie) {
        this.ves = ves;
        this.nastroenie = nastroenie;
    }

    // покормить собаку - вес собаки увеличится на а кг
    public void pokormit(int kg) {
        ves = ves + kg;
    }

    // погладить собаку - настроение собаки увеличится на b пунктов
    public void pogladit(int ras) {

        nastroenie = nastroenie + ras;
    }

    // помыть собаку - настроение собаки уменьшится на раз пунктов
    public void pomit(int ras) {

        nastroenie = nastroenie - ras;
    }
}
