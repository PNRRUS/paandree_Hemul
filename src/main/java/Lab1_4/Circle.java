public class Circle {
    int x; // абсцисса центра окружности
    int y; // ордината центра окружности
    double r; // радиус окружности

    // создание окружности по умолчанию
    public Circle () {
        x = 0;
        y = 0;
        r = 1;
    }

    // создание окружности по конкретным данным
    public Circle (int a, int b, double c) {
        x = a;
        y = b;
        r = c;
    }

    // сдвиг окружности
    public void moveCircle(int a, int b) {
        x += a;
        y += b;
    }
    // площадь окружности
    public double CircleLength (Circle p) {
        double c = 2 * Math.PI * p.r;
        return c;
    }

}
