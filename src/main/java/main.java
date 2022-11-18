

public class main {
    public static void main(String[] args){
        FileController fc = new FileController();
        UserController controller = new UserController();
        fc.SAVER(controller.AddUser());
    }
}
