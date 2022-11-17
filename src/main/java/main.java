import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Gambino\\Desktop\\всякий мусор\\exwork\\src\\main\\java\\data\\" + "asd.txt";
        FileController fc = new FileController();
        UserController controller = new UserController();
        fc.SAVER(controller.AddUser());
    }
}
