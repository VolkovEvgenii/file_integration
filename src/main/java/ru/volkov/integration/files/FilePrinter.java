package ru.volkov.integration.files;

import java.io.*;

public class FilePrinter {

    public void print(File file) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
