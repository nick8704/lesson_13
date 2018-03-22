package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person {

    private String secondName;
    private String firstName;
    private String patronymic;
    /**
     * form variable "dateOfBirth" is "dd/MM/yyyy"
     */
    private String dateOfBirth;

    public Person(String secondName, String firstName, String patronymic, String dateOfBirth) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String secondName, String firstName, String patronymic) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public Person(String fullName) {
        fullName.trim();
        String[] array = fullName.split("\\s");
        this.secondName = array[0];
        this.firstName = array[1];
        this.patronymic = array[2];
    }

    public static String fullName(String secondName, String firstName, String patronymic) {
        String name = secondName + " " + firstName + " " + patronymic;
        return name;
    }

    public static String abbreviatedName(String secondName, String firstName, String patronymic) {
        String name = secondName + " " + firstName.charAt(0) + ". " + patronymic.charAt(0) + ".";
        return name;
    }

    public static int age(String dateOfBirth) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthday = simpleDateFormat.parse(dateOfBirth);
        Calendar calendarBirthday = Calendar.getInstance();
        calendarBirthday.setTime(birthday);
        Date today = new Date();
        Calendar calendarToday = Calendar.getInstance();
        calendarToday.setTime(today);
        int yearsOld = calendarToday.get(Calendar.YEAR) - calendarBirthday.get(Calendar.YEAR);
        if (calendarToday.get(Calendar.DAY_OF_YEAR) < calendarBirthday.get(Calendar.DAY_OF_YEAR)) {
            yearsOld--;
        }
        return yearsOld;
    }

    public String getSecondName() {
        return secondName;
    }
}