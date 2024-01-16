package Guli_10_23;

/* Юзер стори 1 включает в себя поиск и уничтожение одного корабля на площади 5 на пять.
 Компьютер генерирует случайное число от одного до четырех, что составляет количеству палуб у корабля,
  координаты от одного до пяти по вертикали и горизонтали.
   Создается массив пять на пять по координатам корабля заполняется цифрой один остальные поля ноль по умолчанию
   вывести на экран полученный массив
 */
/*Юзер стори 2, завести массив 5 на 5 для отображения выстрелов пользователя тип массива char вывести на экран значения элементов массива
 */
/*сделать четыре выстрела гарантировано  потопить 1 корабль
 */

//US6 генерация кораблей с проверкой на свободное поле - в радиусе 1 клетки НЕТ других кораблей

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class SeaBattleUS9 {
    public static void main(String[] args)  {


        battleField();
        Scanner input = new Scanner(System.in);
        int counter2 = 1;
        boolean free;
        int counter = 0;
        int counter1 = 0;
        int arrayWidth = 10;
        int[][] arr = new int[10][10];
        //int numberShip = (int) Math.round((Math.random() * 3) + 1);
        int line;
        int column;
        //arr[line - 1][column - 1] = 1;
        for (int numberShip = 1; numberShip <= 4; numberShip++) {
            for (int ShipsQty = 1; ShipsQty <= 5 - numberShip; ShipsQty++) {
                int type = (int) Math.round((Math.random()));
                if (type == 1) {
                    do {
                        free = true;
                        column = (int) Math.round((Math.random() * (9 - numberShip)) + 1);
                        line = (int) Math.round((Math.random() * 9) + 1);
                        for (int i = 0; i < numberShip; i++) {
                            if (!fieldFree(arr, line - 1, column - 1 + i)) {
                                free = false;
                                break;
                            }
                        }
                    } while (!free);

                    for (int v = 1; v <= numberShip; v++) {
                        arr[line - 1][column - 2 + v] = numberShip;
                    }

                } else {
                    do {
                        free = true;
                        line = (int) Math.round((Math.random() * (9 - numberShip)) + 1);
                        column = (int) Math.round((Math.random() * 9) + 1);

                        for (int i = 0; i < numberShip; i++) {
                            if (!fieldFree(arr, line - 1 + i, column - 1)) {
                                free = false;
                                break;
                            }
                        }
                    } while (!free);

                    for (int v = 1; v <= numberShip; v++) {
                        arr[line - 2 + v][column - 1] = numberShip;
                    }

                }
            }
        }
//        arr[1][1] = 0;
//        arr[8][1] = 0;
//        arr[9][1] = 1;
        System.out.println(fieldFree(arr, 0, 0));
        System.out.println(fieldFree(arr, 8, 1));
        System.out.println("    1 2 3 4 5 6 7 8 9 10");
        while (counter1 < arrayWidth) {
            if (counter2 == 10) {
                System.out.print(counter2 + "[ ");
            } else {
                System.out.print(counter2 + " [ ");
            }


            counter2++;
            while (counter < arrayWidth) {
                System.out.print(arr[counter1][counter] + " ");

                counter++;
            }
            counter = 0;
            System.out.print("]" + "\n");
            counter1++;
        }
        counter2 = 1;
        counter = 0;
        counter1 = 0;
        arrayWidth = 10;
        char[][] arrFire = new char[10][10];
        System.out.println("\n" + "    1 2 3 4 5 6 7 8 9 10");
        while (counter1 < arrayWidth) {
            if (counter2 == 10) {
                System.out.print(counter2 + "[ ");
            } else {
                System.out.print(counter2 + " [ ");
            }
            counter2++;
            while (counter < arrayWidth) {
                System.out.print(arrFire[counter1][counter] + " ");

                counter++;
            }
            counter = 0;
            System.out.print("]" + "\n");
            counter1++;
        }

        int summa = 1;
        while (summa != 0) {
            System.out.print("номер строки: ");
            int gorisont = input.nextInt();
            System.out.print("номер столбца: ");
            int vertical = input.nextInt();
            if (arr[gorisont - 1][vertical - 1] != 0) {
                arrFire[gorisont - 1][vertical - 1] = 88;
                arr[gorisont - 1][vertical - 1] = 0;
            } else {
                arrFire[gorisont - 1][vertical - 1] = 79;
            }


            counter = 0;
            counter1 = 0;
            arrayWidth = 10;
            while (counter1 < arrayWidth) {
                System.out.print("[ ");
                while (counter < arrayWidth) {
                    System.out.print(arrFire[counter1][counter] + " ");

                    counter++;
                }
                counter = 0;
                System.out.print("]" + "\n");
                counter1++;
            }
            summa = 0;
            for (int g = 0; g < 10; g++) {
                for (int j = 0; j < 10; j++) {
                    summa += arr[g][j];
                }
            }
            System.out.println("Сумма элементов: " + summa);
        }
    }

    public static boolean fieldFree(int[][] arrFree, int line, int vertical) {
        boolean fieldFreeYN;

                if (arrFree[line][vertical] != 0) return false;
                if (line <=8 && arrFree[line + 1][vertical] != 0) return false;
                if (line <=8 && vertical <=8 && arrFree[line + 1][vertical + 1] != 0) return false;
                if (vertical <=8 && arrFree[line][vertical + 1] != 0) return false;
                if (line >=1 && vertical <=8 && arrFree[line - 1][vertical + 1] != 0) return false;
                if (line >=1 && arrFree[line - 1][vertical] != 0) return false;
                if (line >=1 && vertical >=1 && arrFree[line - 1][vertical - 1] != 0) return false;
                if (vertical >=1 && arrFree[line][vertical - 1] != 0) return false;
                if (line <=8 && vertical >=1 && arrFree[line + 1][vertical - 1] != 0) return false;

         {
            fieldFreeYN = true;
        }
        return fieldFreeYN;
    }

    public static void battleField() {
//        private JMenuItem mntmNewGame;
//        private JMenuItem mntmExit;
//        private JMenuItem mntmAbout;



        JFrame field = new JFrame("Sea Battle");


        field.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //кнопка закрытия окна
        field.setSize(999, 742); // размер окна
        field.setLayout(new BorderLayout()); // менеджер компановки?
       field.setLocationRelativeTo(null);
//        field.setVisible(true);
        Icon imageIcon = new ImageIcon("D:/Downloads/Radar.gif");
        JLabel label = new JLabel(imageIcon);field.getContentPane().add(label);
        label.setBounds(500, 0, 100, 20);
        label.setLocation(250,250);

//        label.setVerticalAlignment(JLabel.CENTER);
//        JFrame frame = new JFrame("pepe");
        field.getContentPane().add(label);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        field.pack();
        field.setVisible(true);
        field.setAlwaysOnTop(true);

//        field.setResizable(false);
        SeaBattleFieldUS9 game = new SeaBattleFieldUS9();
        field.add(game);
        label.repaint();






//        JMenuBar menuBar = new JMenuBar();
//        menuBar.setBounds(0, 0, 477, 21);
//        field.getContentPane().add(menuBar);
//        JMenu mnGame = new JMenu("Game");
//        menuBar.add(mnGame);
//        field.mntmNewGame = new JMenuItem("New game");
//        mnGame.add(field.mntmNewGame);
//        JMenuItem mntmProperties = new JMenuItem("Properties");
//        mnGame.add(mntmProperties);
//        field.mntmExit = new JMenuItem("Exit");
//        mnGame.add(field.mntmExit);
//        JMenu mnHelp = new JMenu("Help");
//        menuBar.add(mnHelp);
//        field.mntmAbout = new JMenuItem("About");
//        mnHelp.add(field.mntmAbout);
//    }

    }






}
//import javax.swing.*;
//        import java.awt.*;
//
//public class SeaBattleField extends JComponent {
//
//
//    @Override
//    public void paintComponent(Graphics graphics) {
//        super.paintComponent(graphics);
//        graphics.setColor(Color.RED);
//        graphics.drawOval(10,10,20,20);
//        graphics.drawLine(0,0,getWidth(),getHeight());
//        graphics.drawLine(0,0,399,399);
//        graphics.drawLine(0,0,399,0);
//        graphics.drawLine(0,0,0,399);
////        System.out.println(getWidth());
////       System.out.println(getHeight());
//    }
//}
//
//
//
//
//
//
//
//
//}
//
//public static void battleField () {
//        JFrame field = new JFrame("Sea Battle");
//        field.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //кнопка закрытия окна
//        field.setSize(420,430); // размер окна
//        field.setLayout(new BorderLayout()); // менеджер компановки?
//        field.setLocationRelativeTo(null);
//        field.setVisible(true);
//        SeaBattleField game = new SeaBattleField();
//        field.add(game);
//
//
//        }






//int max = arr[0][0];
//    int min = arr[0][0];
//            for (int i = 0; i < arrayHeight; i++) {
//        for (int j = 0; j < arrayWidth; j++) {
//        if (arr[i][j] >= max) {
//        max = arr[i][j];
//        }
//        if (arr[i][j] <= min) {
//        min = arr[i][j];
//        }
//        }
//        }
///*for(int v = 1;v <= numberShip;v++) {
//arr[number2][v] = 1;}
// */