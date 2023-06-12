package Task_14;

import java.io.*;

public class Task14 {
    //task 1
   /* public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\romeo-and-juliet.txt"));
        int i;
        StringBuilder str = new StringBuilder();
        while ((i = br.read()) != -1) {
            str.append((char) i);
        }
        br.close();
        String[] array = str.toString().replaceAll("\\W", " ").split(" ");
        String max = array[0];
        for (int k = 1; k < array.length; k++) {
            if (array[k].length() > max.length()) {
                max = array[k];
            }
        }
        System.out.println(max);
        FileWriter fw = new FileWriter("D:\\longest-word.txt");
        fw.write(max);
        fw.close();
    }*/

    // task 2
   /* public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\docs.txt");
        StringBuilder sb = new StringBuilder();
        int i;
        while ((i = fr.read()) != -1) {
            sb.append((char) i);
        }
        fr.close();
        FileWriter valid = new FileWriter("D:\\valid-numbers.txt", true);
        FileWriter invalid = new FileWriter("D:\\invalid-numbers.txt",true );
        String[] arr = sb.toString().split("\\s");
        for (String s : arr) {
            if (s.matches("docnum\\w{9}") || s.matches("contract\\w{7}")) {
                valid.write(s + "\n");
                valid.flush();
            } else {
                invalid.write(s + " - does not match the requirements" + "\n");
                invalid.flush();
            }
        }
        valid.close();
        invalid.close();
    }*/
}
