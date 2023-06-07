package Task_13;

import java.io.FileInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraTask13 {
    public static void main(String[] args) {
        try {
            FileInputStream s = new FileInputStream("D:\\file.txt");
            try {
                Pattern pattern = Pattern.compile("\\w+([\\.\\-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
                Matcher matcher = pattern.matcher(s.toString());
                while (matcher.find()) {
                    System.out.println("email: " + matcher.group());
                }
            } catch (Exception e) {
                System.out.println("Exception");
            } finally {
                System.out.println("111111");
            }
        } catch (Exception e) {
            System.out.println("Ошибка при поиске файла. Файл не найден");
        }
    }
}
