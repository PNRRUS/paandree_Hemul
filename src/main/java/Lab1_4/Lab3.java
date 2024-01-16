public class Lab3 {

//    #1 Построить иерархию классов для описания плоских геометрических фигур
//    (у каждой есть координата ее центра по X и Y):


    public static void main(String[] args) {

        //    Круг;

        Circle с1 = new Circle();
        System.out.println("данные окружности #1 " + "x=" + с1.x + " y=" + с1.y + " r=" + с1.r);
        Circle с2 = new Circle(3, 5, 2);
        System.out.println("данные окружности #2 " + "x=" + с2.x + " y=" + с2.y + " r=" + с2.r);

        System.out.println("площадь окружности #1 " + с1.CircleLength(с1));
        System.out.println("площадь окружности #2 " + с2.CircleLength(с2));

        с1.moveCircle(2, 2);
        System.out.println("данные окружности #1 после сдвига " + "x=" + с1.x + " y=" + с1.y + " r=" + с1.r);
        с2.moveCircle(-2, 7);
        System.out.println("данные окружности #1 после сдвига " + "x=" + с2.x + " y=" + с2.y + " r=" + с2.r);

        //    Квадрат;

        Square d1 = new Square();
        System.out.println("данные квадрата #1 " + "x=" + d1.x + " y=" + d1.y + " r=" + d1.r);
        Square d2 = new Square(-2, 4, 6);
        System.out.println("данные квадрата #2 " + "x=" + d2.x + " y=" + d2.y + " r=" + d2.r);

        System.out.println("площадь квадрата #1 " + d1.SquareArea(d1));
        System.out.println("площадь квадрата #2 " + d2.SquareArea(d2));

        d1.moveSquare(5, -4);
        System.out.println("данные квадрата #1 после сдвига " + "x=" + d1.x + " y=" + d1.y + " r=" + d1.r);
        d2.moveSquare(-2, 9);
        System.out.println("данные квадрата #1 после сдвига " + "x=" + d2.x + " y=" + d2.y + " r=" + d2.r);

        //    Прямоугольник;

        Rectangle e1 = new Rectangle();
        System.out.println("данные прямоугольника #1 " + "x=" + e1.x + " y=" + e1.y + " r=" + e1.r + " r1= " + e1.r1);
        Rectangle e2 = new Rectangle(-2, 4, 6, 2);
        System.out.println("данные прямоугольника #2 " + "x=" + e2.x + " y=" + e2.y + " r=" + e2.r + " r1= " + e2.r1);

        System.out.println("площадь прямоугольника #1 " + e1.SquareRectangle(e1));
        System.out.println("площадь прямоугольника #2 " + e2.SquareRectangle(e2));

        e1.moveRectangle(5, -4);
        System.out.println("данные прямоугольника #1 после сдвига " + "x=" + e1.x + " y=" + e1.y
                + " r=" + e1.r + " r1= " + e1.r1);
        e2.moveRectangle(-2, 9);
        System.out.println("данные прямоугольника #1 после сдвига " + "x=" + e2.x + " y=" + e2.y
                + " r=" + e2.r + " r1= " + e2.r1);

    }


}
