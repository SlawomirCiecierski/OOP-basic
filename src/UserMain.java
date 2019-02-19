import controller.UserController;
//import model.User;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class UserMain {

    public static void main(String[] args) {

        UserController uc = new UserController();
        uc.addUser("M", "K", "m", "P", "mddk@mk.pl", "998g899", LocalDate.of(1964, 01, 01), LocalDateTime.now());
        uc.addUser("M", "K", "m", "P", "mk@mk.pl", "998899", LocalDate.of(1964, 02, 01), LocalDateTime.now());
        uc.addUser("v", "F", "mmm", "dd", "mk@mdk.pl", "99438899", LocalDate.of(1964, 01, 11), LocalDateTime.now());
        uc.addUser("b", "K", "m", "P", "mdddk@mk.pl", "9983899", LocalDate.of(1979, 07, 01), LocalDateTime.now());
        uc.addUser("z", "K", "m", "P", "mddk@mk.pl", "9981899", LocalDate.of(1999, 01, 03), LocalDateTime.now());
        uc.addUser("M", "K", "m", "P", "mddk@mk.pl", "998g899", LocalDate.of(2000, 01, 01), LocalDateTime.now());
        uc.addUser("M", "K", "m", "P", "mk@mk.pl", "998899", LocalDate.of(2001, 02, 01), LocalDateTime.now());
        uc.addUser("v", "F", "mmm", "dd", "mk@mdk.pl", "99438899", LocalDate.of(2002, 01, 11), LocalDateTime.now());
        uc.addUser("b", "K", "m", "P", "mdddk@mk.pl", "9983899", LocalDate.of(1979, 07, 01), LocalDateTime.now());
        uc.addUser("z", "K", "m", "P", "mddk@mk.pl", "9981899", LocalDate.of(1999, 01, 03), LocalDateTime.now());

        uc.getAllUsers();

        //System.out.println("User: "+ uc.birthdateComparator(0,1));
        uc.sortByBirthDate();
        System.out.println();
        uc.getAllUsers();


    }

}
