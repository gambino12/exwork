import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileController {
    public  void SAVER(user user) {

            String path = "C:\\Users\\Gambino\\Desktop\\всякий мусор\\exwork\\src\\main\\java\\data\\"
                    + user.getFIO()[0] + ".txt";
            try (FileWriter fileWriter = new FileWriter(path, true)){
                File file = new File(path);
                if (file.exists()) {
                    System.out.println("Контакт успешно записан");
                    fileWriter.write(user.toString());
                    fileWriter.append("\n");
                    fileWriter.flush();
                }
                else {
                    System.out.println("Человек с такой фамилей уже есть");
                    fileWriter.write(user.toString());
                    fileWriter.append("\n");
                    fileWriter.flush();
                }
            }
        catch (IOException exception) {
            System.out.println("Asd");
        }
    }
}
