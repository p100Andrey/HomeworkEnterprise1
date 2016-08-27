package com.company;

import java.io.*;

public class CsvClass {
    public static void write(File file, String text) {
        PrintWriter out = null;

        try {
//            if (file.exists()) {
//                file.delete();
//             }
            if (!file.exists()) {
                System.out.println("The file is created");
                file.createNewFile();
            }
            String oldText = read(file);
            out = new PrintWriter(file);
            text = oldText + text;
            out.print(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    public static String read(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
