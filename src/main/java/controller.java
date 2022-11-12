
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class controller {
    public static String[] addFIO(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ФИО через пробел-> ");
        String [] name = sc.nextLine().split(" ");
        if(name.length != 3){
            throw new RuntimeException("Вы должны ввести имя фамилию и отчество");
        }
        return name;
    }

    public static long addPhonenum() {  //создать массив чисел от 0-10 и бегать по нему проверяю
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("номер телефона без символов-> ");
            long num = sc.nextLong();
            return num;
        } catch (InputMismatchException ex) {
            System.out.println("неккоректный ввод данных");
        }
        return addPhonenum();
    }

    public static String addDateOfBirth(){  //поменять на инт
        Scanner sc = new Scanner(System.in);
        System.out.print("Дата рождения (dd.mm.yyyy)-> ");
        String daate1 = sc.nextLine();
        if(daate1.charAt(2)!='.'&&daate1.charAt(5)!='.') {
            throw new RuntimeException("Неккоректный формат 00.00.0000");
        }
        String []date = daate1.split("\\.");
        System.out.println(Arrays.toString(date));
        if(date[0].length()!=2&&date[1].length()!=2&&date[2].length()!=4){
            throw new RuntimeException("naxui");
        }
        return daate1;

    }

    public static char addGender(){
        System.out.println("Введите гендер f or m");
        Scanner sc = new Scanner(System.in);
        String gender = sc.nextLine();
        if (gender.length()!=1){
            throw new RuntimeException("lenght");
        }
        if (!gender.equals("f") && !gender.equals("m")){
            throw new RuntimeException("f or m");
        }
        return gender.charAt(0);

    }
    public static user AddUser(){
        user user = new user();
        user.setFIO(addFIO());
        user.setPhoneNum(addPhonenum());
        user.setGender(addGender());

        return user;
    }

    public static void main(String[] args) {
        System.out.println(addDateOfBirth());
    }
}
