package Lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileCopy {
    String fileName1;
    String fileName2;

    public fileCopy(String fileName1, String fileName2) {
        this.fileName1 = fileName1;
        this.fileName2 = fileName2;
    }

    public void Copy() {
        String s = "";

        try (FileReader reader = new FileReader(fileName1)) {
            int c;

            while ((c = reader.read()) != -1) {
                s = s + (char) c;
            }

        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());

        }

        try (FileWriter writer1 = new FileWriter(fileName2)) {
            writer1.write(s);
        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

