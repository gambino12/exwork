public class Controller extends UserController {
    public  user AddUser(){
        user user = new user();
        user.setFIO(addFIO());
        user.setDateOfBirth(addDateOfBirth());
        user.setPhoneNum(addPhonenum());
        user.setGender(addGender());

        return user;
    }
}
