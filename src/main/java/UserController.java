import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserController extends user {
    public String[] addFIO(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ФИО через пробел-> ");
        String [] name = sc.nextLine().split(" ");
        if(name.length != 3){
            throw new RuntimeException("Вы должны ввести имя фамилию и отчество");
        }
        return name;
    }


    public  long addPhonenum() {  //создать массив чисел от 0-10 и бегать по нему проверяю
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("номер телефона без символов-> ");
            return sc.nextLong();
        } catch (InputMismatchException ex) {
            System.out.println("неккоректный ввод данных");
        }
        return addPhonenum();
    }

    public String addDateOfBirth(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Дата рождения (dd.mm.yyyy)-> ");
        String [] date = sc.nextLine().split("\\.");
        String date1 = "";
     if (date[0].length() !=2 &&date[1].length() !=2 && date[2].length() !=4 ){
         throw new RuntimeException("неверный формат ввода (dd.mm.yyyy)");
     }
        ArrayList<Integer> a = new ArrayList<>();
     try {
         for (String st:date) {  //проверка на число
             int temp = Integer.parseInt(st);
             a.add(temp);
         }
     }
     catch (NumberFormatException ex){
         return "неверный ввод чисел";
     }
     if ((a.get(0)>31||a.get(0)<1)||(a.get(1)>12||a.get(1)<1)){
         throw new RuntimeException("неверная дата");
     }
     StringBuilder sb = new StringBuilder();
        for (int st:a) {
            if (st<10){
                date1 = String.valueOf(sb.append("0"+st + "."));
            }
            else if (st>1000){
                date1 = String.valueOf(sb.append(st));
            }
            else
            date1 = String.valueOf(sb.append(st + "."));
        }
        return date1;

    }

    public  char addGender(){
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

}
