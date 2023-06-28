package Lesson_14;

import java.io.*;
//import java.util.Arrays;

public class Lesson14 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("D:\\newFile.txt");
        //String text = "Hello from group 67! Привет привет";

        //cохраняем байты в файл
        /*FileOutputStream outputStream = new FileOutputStream(file); //создаем объект и кладем туда файл для экспорта
        outputStream.write(text.getBytes()); // передаем в объект строку переведенную в байты
        outputStream.flush(); // заставляет сохранить то, что до него.
        outputStream.close();*/

        // выкачиваем инфу из файла
      /*  int i;
        FileInputStream fileInputStream = new FileInputStream(file);
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i); // выводит фигню если русский текст, поэтому надо тут испольтзовать символьный класс
        }
        fileInputStream.close();*/

        //выкачиваем с символьным классом
        /*FileReader fr = new FileReader(file);
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i); // выводит символьное хорошо
        }
        fr.close();*/
/*
        try (FileWriter fw = new FileWriter(file, true)) { //если ставить флаг тру. то он будет не перезаписывать, а добавлять
            fw.write("Hello world. ");
            fw.flush();
            fw.write("We are the best group. ");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

       /*boolean result = file.createNewFile();
        System.out.println(result);
        File allFiles[] = file.listFiles();
        System.out.println(Arrays.toString(allFiles));
        if (file.isFile()) {
            System.out.println("Some file");
        } else if (file.isDirectory()) {
            System.out.println("Some folder");
        }*/
        // мы можем объекты перевести в байты, потом сериализовать и сохран в файлы, бд, нэт. и он сохраниться после заверщшения проги
        // таким образом мы продливаем жизнь

        Weekend weekend = new Weekend();
        weekend.name = "Friday";
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:\\week.txt"));
        outputStream.writeObject(weekend);
        outputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\week.txt"));
        Weekend weekend1 = (Weekend) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(weekend1.name);
       // если мы не хотим какое-то поле, то перед ним ставим transient. тогда оно не экспортируется в файл.

    }
}
