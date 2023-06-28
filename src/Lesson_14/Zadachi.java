package Lesson_14;

import java.io.*;
import java.util.Scanner;

public class Zadachi {
    public static void main(String[] args) throws IOException {
        /*File file = new File("D:\\tms.txt");
        FileOutputStream fOut = new FileOutputStream(file);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line: ");
        String str = scanner.nextLine();
        fOut.write(str.getBytes());
        fOut.flush();
        fOut.close();

        FileInputStream fIn = new FileInputStream(file);
        int i;
        StringBuilder newLine = new StringBuilder();
        while ((i = fIn.read()) != -1) {
            newLine.append((char) i);
        }
        fIn.close();

        System.out.println(newLine.toString().replace(" ", "_"));*/

        File file = new File("D:\\tms2.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("Cognosce te ipsum");
        fw.flush();
        fw.close();

        FileReader fr = new FileReader(file);
       // fr.toString.charAt(1));

    }
}
