public class Square {
    int x; // абсцисса центра квадрата
    int y; // ордината центра квадрата
    double r; // длина стороны квадрата

    // создание квадрата по умолчанию
    public Square() {
        x = 0;
        y = 0;
        r = 1;
    }

    // создание квадрата по конкретным данным
    public Square(int a, int b, double c) {
        x = a;
        y = b;
        r = c;
    }

    // сдвиг квадрата
    public void moveSquare(int a, int b) {
        x += a;
        y += b;
    }

    // площадь квадрата
    public double SquareArea(Square p) {
        double c = p.r * p.r;
        return c;
    }
}
