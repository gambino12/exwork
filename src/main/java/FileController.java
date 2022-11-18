import java.io.FileWriter;
import java.io.IOException;


public class FileController {
    public  void SAVER(user user) {

            String path = "C:\\Users\\Gambino\\Desktop\\всякий мусор\\exwork\\src\\main\\java\\data\\"
                    + user.getFIO()[0] + ".txt";
            try (FileWriter fileWriter = new FileWriter(path, true)){
                    System.out.println("контакт успешно запсиан");
                    fileWriter.write(user.toString());
                    fileWriter.append("\n");
            }
        catch (IOException exception) {
            System.out.println("Ошибка работы с файлом");
        }
    }
}
