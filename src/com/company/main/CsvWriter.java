package com.company.main;

import java.io.*;

public class CsvWriter {
    public static void write(File file, String text) {
        String oldText = read(file);
        try (PrintWriter out = new PrintWriter(file)) {
            if (!file.exists()) {
                System.out.println("The file is created");
                file.createNewFile();
            }
            text = oldText + text;
            out.print(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String read(File file) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()))){
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    static void cleanCsvFile(File file) {
        if (file.exists()) {
            try (PrintWriter out = new PrintWriter(file)){
                out.print("");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
