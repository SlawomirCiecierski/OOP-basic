package controller;

import java.util.regex.Pattern;

public class RegExpController {

    public boolean checkPostalCode(String postalCode){
        String template="^[+]{1}\\d{2,3}-\\d{3}-\\d{3}-\\d{3}";
        String templateEmail="^[a-zA-Z0-9]*[.]?[a-zA-Z0-9]+[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z0-9]+$";
        return Pattern.matches(templateEmail, postalCode);
    }

    public static void main(String[] args) {
        RegExpController rec=new RegExpController();
//        System.out.println(rec.checkPostalCode("03-222"));
//        System.out.println(rec.checkPostalCode("03-2u2"));
//        System.out.println(rec.checkPostalCode("03-222"));
//        System.out.println(rec.checkPostalCode("s3-222"));
//        System.out.println("pesel");
//        System.out.println(rec.checkPostalCode("12345678901"));
//        System.out.println("telefony");
//        System.out.println(rec.checkPostalCode("+48-609-010-088"));
//        System.out.println(rec.checkPostalCode("+48-6090010-088"));
//        System.out.println(rec.checkPostalCode("+482-609-010-088"));

          System.out.println("email");
          //
      System.out.println(rec.checkPostalCode("ciecierski@post.pl"));
      System.out.println(rec.checkPostalCode("ciecierski@post.com.pl"));
      System.out.println(rec.checkPostalCode("cieci.erski@post.pl"));
    }
}
