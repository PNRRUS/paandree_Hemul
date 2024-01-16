package Lab8;

import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
    String text1;
    String text2;
    String text3;
    String text4;

    public fileWrite(String text1, String text2, String text3, String text4) {
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
    }

    public void Write() {

        try (FileWriter writer = new FileWriter("C:\\Users\\A79169599\\Downloads\\out.txt")) {
            writer.write(text1);
            writer.write(text2);
            writer.write(text3);
            writer.write(text4);
        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
