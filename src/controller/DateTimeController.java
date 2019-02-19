package controller;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Period;

public class DateTimeController {
    public int getAgeFromStringDate(String date) {
        LocalDate birthdate = LocalDate.parse(date);
        LocalDate today = LocalDate.now();
        Period age=Period.between(birthdate, today);
        System.out.println(age);
        return age.getYears();
    }


    public LocalDate dateComparator(String d1, String d2){

        LocalDate d1Data=LocalDate.parse(d1);
        LocalDate d2Data=LocalDate.parse(d2);

        return d1Data.isBefore(d2Data)?d1Data:d2Data;
    }

    public static void main(String[] args) {
        DateTimeController dtc=new DateTimeController();
        //dtc.getAgeFromStringDate("1989-12-18");
        System.out.println("Twój wiek dokładny: "+ dtc.getAgeFromStringDate("1989-12-18")+" lat");
        System.out.println("Wcześniejsza data: "+ dtc.dateComparator("2000-12-18","2000-12-20"));
        System.out.println("Wcześniejsza data: " + dtc.dateComparator("2010-12-18","2007-10-17"));
    }




}

