public class Rectangle {
    int x; // абсцисса центра прямоугольника
    int y; // ордината центра прямоугольника
    double r; // длина 1-й стороны прямоугольника
    double r1; // длина 2-й стороны прямоугольника

    // создание прямоугольника по умолчанию
    public Rectangle() {
        x = 0;
        y = 0;
        r = 1;
        r1 = 2;

    }

    // создание прямоугольника по конкретным данным
    public Rectangle(int a, int b, double c, double d) {
        x = a;
        y = b;
        r = c;
        r1 = d;
    }

    // сдвиг прямоугольника
    public void moveRectangle(int a, int b) {
        x += a;
        y += b;
    }

    // площадь прямоугольника
    public double SquareRectangle(Rectangle p) {
        double c = p.r * p.r1;
        return c;
    }
}
