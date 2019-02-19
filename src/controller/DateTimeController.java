package controller;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Period;

public class DateTimeController {
    public int getAgeFromStringDate(String date) {
        LocalDate birthdate = LocalDate.parse(date);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthdate, today);
        System.out.println(age);
        return age.getYears();
    }


    public LocalDate dateComparator(String d1, String d2) {

        LocalDate d1Data = LocalDate.parse(d1);
        LocalDate d2Data = LocalDate.parse(d2);
        return d1Data.isBefore(d2Data) ? d1Data : d2Data;
    }

    //ile poniedziałków występuje między dwoma datami
    public int getMondaysBetweenDates(String d1, String d2) {
        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);
        //sprawdzam, która data jest mniejsza a która większa
        LocalDate lessDate = date1.isBefore(date2) ? date1 : date2;
        LocalDate greaterDate = date1.isAfter(date2) ? date1 : date2;
        int mondayCounter = 0;
        //1.inicjalizujemy pętlę datą mniejszą
        //2.warunkiem wykonania jest sprawdzenie czy data mniejsza nie przekroczyła większej
        //3.dodaje jeden dzień
        for (LocalDate ld = lessDate; ld.isBefore(greaterDate); ld = ld.plusDays(1)) {
            ;
            if (ld.getDayOfWeek() == DayOfWeek.MONDAY) {
                mondayCounter++;
            }
        }
        return mondayCounter;
    }

    public void myBirthday(String d) {
LocalDate date=LocalDate.parse(d);
DayOfWeek myDay=date.getDayOfWeek();
        System.out.println((date.getDayOfWeek()));
for (LocalDate ld = date; ld.isBefore(LocalDate.now()); ld=ld.plusYears(1)){
    if (ld.getDayOfWeek()==myDay){
        System.out.println(ld);
    }
}
    }


    public static void main(String[] args) {
        DateTimeController dtc = new DateTimeController();
        //dtc.getAgeFromStringDate("1989-12-18");
        System.out.println("Twój wiek dokładny: " + dtc.getAgeFromStringDate("1989-12-18") + " lat");
        System.out.println("Wcześniejsza data: " + dtc.dateComparator("2000-12-18", "2000-12-20"));
        System.out.println("Wcześniejsza data: " + dtc.dateComparator("2010-12-18", "2007-10-17"));
        System.out.println("Liczba poniedziałków między datami: " + dtc.getMondaysBetweenDates("2019-02-19", "2019-03-05"));
        dtc.myBirthday("1964-05-19");
    }


}

