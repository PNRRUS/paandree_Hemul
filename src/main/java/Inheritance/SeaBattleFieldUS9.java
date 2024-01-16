package Guli_10_23;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class SeaBattleFieldUS9 extends JComponent {

public int x0,y0,x1,y1;
public int[][] arr = new int[10][10];
public int[][] arrShot = new int[10][10];
public int[][] arrShotPC = new int[10][10];
public int[][] arrShotPCBack = new int[10][10];



     public SeaBattleFieldUS9() {
         fieldInitial(arr);
         fieldInitial(arrShotPC);
         enableEvents(AWTEvent.MOUSE_EVENT_MASK);
     }

//    @Override
//    public void mousePressed(MouseEvent arg0) {
//        mouseEvent.mousePressed(arg0);

    @Override
    protected void processMouseEvent(MouseEvent mouseEvent) {
         super.processMouseEvent(mouseEvent);

//         if (mouseEvent.getButton() == MouseEvent.BUTTON1 && mouseEvent.getClickCount() > 1) {делает 3 события вместо одного
             if (mouseEvent.getID() == MouseEvent.MOUSE_PRESSED && mouseEvent.getClickCount() > 1) {
             x0 = mouseEvent.getX();
             y0 = mouseEvent.getY();
//             try {
//                 Thread.sleep(200);
//             } catch (InterruptedException e) {
//                 throw new RuntimeException(e);
//             }
             System.out.println("x0= " + x0);
             System.out.println("y0= " + y0);
             if (arrShotPC[(y0-40)/40][(x0-540)/40] == 0) {
                 arrShot[(y0-40)/40][(x0-540)/40] = 9;
                 do
                 {x1 = (int) Math.round((Math.random() * 9));
                 y1 = (int) Math.round((Math.random() * 9));}
                 while (arrShotPCBack[x1][y1] != 0);

                 if (arr[x1][y1] == 0) arrShotPCBack[x1][y1] = 9;

//                 System.out.println("arrShot[" + (y0)/40 + "][" + (x0-500)/40 + "]=" + arrShot[(y0)/40][(x0-500)/40]);
//                 System.out.println("arr[" + (y0)/40 + "][" + (x0-500)/40 + "]=" + arr[(y0)/40][(x0-500)/40]);
             }
             if (arrShotPC[(y0-40)/40][(x0-540)/40] != 0) {
                 arrShot[(y0-40)/40][(x0-540)/40] = 8;
                 do
                 {x1 = (int) Math.round((Math.random() * 9));
                     y1 = (int) Math.round((Math.random() * 9));}
                 while (arrShotPCBack[x1][y1] != 0);

                 if (arr[x1][y1] != 0) arrShotPCBack[x1][y1] = 8;


//                 System.out.println("arrShot[" + (y0)/40 + "][" + (x0-500)/40 + "]=" + arrShot[(y0)/40][(x0-500)/40]);
//                 System.out.println("arr[" + (y0)/40 + "][" + (x0-500)/40 + "]=" + arr[(y0)/40][(x0-500)/40]);
             }

             repaint();
         }
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        int color;

        int y = 0;
        int gh = 0;
        int counter2 = 0;

            try {
                graphics.drawImage(ImageIO.read(new File("C:/Roma Java/paandree/src/main/java/Guli_10_23/256.jpg")), 0, 0, null);
            } catch (IOException a) {
                throw new RuntimeException(a);
        }
        try {
            graphics.drawImage(ImageIO.read(new File("D:/Downloads/Radar.gif")), 900, 800, null);
        } catch (IOException e) {
            throw new RuntimeException(e);}
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setFont(new Font("ALGERIAN", Font.ITALIC, 20));
        g2.setPaint(Color.black);

        graphics.drawString("   a    b      c     d      e     f      g       h      i     j", 40, 20);

        graphics.drawString("1 ", 2, 65);
        graphics.drawString("2 ", 2, 105);
        graphics.drawString("3 ", 2, 145);
        graphics.drawString("4 ", 2, 185);
        graphics.drawString("5 ", 2, 225);
        graphics.drawString("6 ", 2, 265);
        graphics.drawString("7 ", 2, 305);
        graphics.drawString("8 ", 2, 345);
        graphics.drawString("9 ", 2, 385);
        graphics.drawString("10", 2, 427);

        graphics.drawString("          a    b      c     d      e     f      g       h      i      j", 500, 20);

        graphics.drawString("1 ", 500, 70);
        graphics.drawString("2 ", 500, 110);
        graphics.drawString("3 ", 500, 150);
        graphics.drawString("4 ", 500, 190);
        graphics.drawString("5 ", 500, 230);
        graphics.drawString("6 ", 500, 270);
        graphics.drawString("7 ", 500, 310);
        graphics.drawString("8 ", 500, 350);
        graphics.drawString("9 ", 500, 390);
        graphics.drawString("10", 500, 430);

        for (int counter = 0; counter < 11; counter++) {
            graphics.drawLine(y, 40, gh, 440);
            gh += 40;
            y += 40;
        }
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setFont(new Font("ALGERIAN", Font.ITALIC, 82));
        g2.setPaint(Color.BLACK);
        graphics.drawString("Sea War 9.0", 0, 540);
        gh = 40;
        y = 40;
        for (int counter = 0; counter < 11; counter++) {
            graphics.drawLine(40, y, 440, gh);
            gh += 40;
            y += 40;
        }
        g2.setFont(new Font("Arial Cyr", Font.ITALIC, 25));
        g2.setPaint(Color.BLACK);
        graphics.drawString("Ваша задача:  ", 0, 580);
        graphics.drawString("сбить корабли противника, не потеряв свои  ", 0, 600);
        graphics.drawString("Удачи канонир(артиллерист)  ", 0, 620);
        for (int i = 0; i <= 399; i += 40) {
            for (int j = 0; j <= 399; j += 40) {
                if (arr[i / 40][j / 40] == 0) {
                    graphics.setColor(Color.BLUE);
                    graphics.fill3DRect(j + 40, i + 40, 40, 40, true);
                } else {
                    graphics.setColor(Color.DARK_GRAY);
                    graphics.fill3DRect(j + 40, i + 40, 40, 40, true);
                }
            }

        }

        for (int o = 500; o <= 899; o += 40) {
            for (int p = 0; p <= 399; p += 40) {
                graphics.setColor(Color.BLUE);
                graphics.fill3DRect(o + 40, p + 40, 40, 40, true);

            }
        }

              //  try {
        //graphics.drawImage(ImageIO.read(new File("C:/Roma Java/paandree/src/main/java/Guli_10_23/pepe123.jpg")), 540, 40, null);

        //graphics.drawImage(ImageIO.read(new File("C:/Roma Java/paandree/src/main/java/Guli_10_23/pepe123.jpg")), 580, 80, null);
    //} catch (IOException e) {
    //    throw new RuntimeException(e);
    //}


        for (int i = 0; i <= 399; i += 40) {
            for (int j = 0; j <= 399; j += 40) {
                if (arrShot[i / 40][j / 40] == 9) {
                    graphics.setColor(Color.WHITE);
                    graphics.drawOval(j + 554, i + 55, 8, 8);
                    graphics.drawOval(j + 555, i + 55, 8, 8);
                    graphics.drawOval(j + 556, i + 55, 8, 8);
                    graphics.drawOval(j + 557, i + 55, 8, 8);
                    graphics.drawOval(j + 558, i + 55, 8, 8);
//                    graphics.drawOval(500+j+10+40, i+10+40, 20, 20);
                }
                if (arrShot[i / 40][j / 40] == 8) {
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine(j + 540, i + 40, j + 580, i + 80);
                    graphics.drawLine(j + 580, i + 40, j + 540, i + 80);
                    graphics.drawLine(j + 541, i + 40, j + 581, i + 80);
                    graphics.drawLine(j + 581, i + 40, j + 541, i + 80);
                    graphics.drawLine(j + 542, i + 40, j + 582, i + 80);
                    graphics.drawLine(j + 582, i + 40, j + 542, i + 80);
                    //  graphics.drawOval(500+j+10+40, i+10+40, 20, 20);
                }
                if (arrShotPCBack[i / 40][j / 40] == 9) {
                    graphics.setColor(Color.WHITE);
                    graphics.drawOval(j + 54, i + 55, 8, 8);
                    graphics.drawOval(j + 55, i + 55, 8, 8);
                    graphics.drawOval(j + 56, i + 55, 8, 8);
                    graphics.drawOval(j + 57, i + 55, 8, 8);
                    graphics.drawOval(j + 58, i + 55, 8, 8);

                }
                if (arrShotPCBack[i / 40][j / 40] == 8) {
                    graphics.setColor(Color.RED);
                    graphics.drawLine(j + 40, i + 40, j + 80, i + 80);
                    graphics.drawLine(j + 80, i + 40, j + 40, i + 80);
                    graphics.drawLine(j + 41, i + 40, j + 81, i + 80);
                    graphics.drawLine(j + 81, i + 40, j + 41, i + 80);
                    graphics.drawLine(j + 42, i + 40, j + 82, i + 80);
                    graphics.drawLine(j + 82, i + 40, j + 42, i + 80);
                    //  graphics.drawOval(500+j+10+40, i+10+40, 20, 20);
                }
            }

        }
    }

    public static boolean fieldFree(int[][] arrFree, int line, int vertical) {
        boolean fieldFreeYN;

        if (arrFree[line][vertical] != 0) return false;
        if (line <= 8 && arrFree[line + 1][vertical] != 0) return false;
        if (line <= 8 && vertical <= 8 && arrFree[line + 1][vertical + 1] != 0) return false;
        if (vertical <= 8 && arrFree[line][vertical + 1] != 0) return false;
        if (line >= 1 && vertical <= 8 && arrFree[line - 1][vertical + 1] != 0) return false;
        if (line >= 1 && arrFree[line - 1][vertical] != 0) return false;
        if (line >= 1 && vertical >= 1 && arrFree[line - 1][vertical - 1] != 0) return false;
        if (vertical >= 1 && arrFree[line][vertical - 1] != 0) return false;
        if (line <= 8 && vertical >= 1 && arrFree[line + 1][vertical - 1] != 0) return false;

        {
            fieldFreeYN = true;
        }
        return fieldFreeYN;
    }

    public void fieldInitial(int[][] arrFree) {
        int line;
        int column;
        boolean free;

        for (int numberShip = 4; numberShip >= 1; numberShip--) {
            for (int ShipsQty = 1; ShipsQty <= 5 - numberShip; ShipsQty++) {
                int type = (int) Math.round((Math.random()));
                if (type == 1) {
                    do {
                        free = true;
                        column = (int) Math.round((Math.random() * (9 - numberShip)) + 1);
                        line = (int) Math.round((Math.random() * 9) + 1);
                        for (int i = 0; i < numberShip; i++) {
                            if (!fieldFree(arrFree, line - 1, column - 1 + i)) {
                                free = false;
                                break;
                            }
                        }
                    } while (!free);

                    for (int v = 1; v <= numberShip; v++) {
                        arrFree[line - 1][column - 2 + v] = numberShip;
                    }

                } else {
                    do {
                        free = true;
                        line = (int) Math.round((Math.random() * (9 - numberShip)) + 1);
                        column = (int) Math.round((Math.random() * 9) + 1);

                        for (int i = 0; i < numberShip; i++) {
                            if (!fieldFree(arrFree, line - 1 + i, column - 1)) {
                                free = false;
                                break;
                            }
                        }
                    } while (!free);

                    for (int v = 1; v <= numberShip; v++) {
                        arrFree[line - 2 + v][column - 1] = numberShip;
                    }

                    //numberShip = (int) Math.round((Math.random() * 3) + 1);
                }
            }
        }
    }


}




