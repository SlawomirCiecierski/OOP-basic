package controller;

import model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserController {
    User users[] = new User[100];
    int index;

    public void addUser(String name, String lastname, String login, String password, String email, String phone, LocalDate birth_date, LocalDateTime registration_data_time) {
        User u = new User(name, lastname, login, password, email, phone, birth_date, registration_data_time);
        //zmiana czasu o +1
        u.setRegistration_data_time(u.getRegistraoion_data_time().plusHours(-3));
        users[index] = u;
        index++;

    }

    public void getAllUsers() {
        for (int i = 0; i < index; i++) {
            System.out.println(users[i]);

        }
    }
//metoda porównująca ddaty urodzenia dwóch użytkownikow
    //jezeli pierwsza data jest mniejsza od drugie +> true else false

    public boolean birthdateComparator(User u1, User u2) {

        return u1.getBirth_date().isBefore(u2.getBirth_date());
    }

    public boolean birthdateComparator(int index1, int index2) {
        return users[index1].getBirth_date().isBefore(users[index2].getBirth_date());
    }

    public void sortByBirthDate() {
        //-----------------------

        for (int j = 0; j<index;
        j++){
            for (int i = 1; i < index; i++) {
                if (!birthdateComparator(i - 1, i)) {
                    User u1 = users[i - 1];
                    User u2 = users[i];
                    users[i - 1] = u2;
                    users[i] = u1;

                }
            }
        }
    }
}
