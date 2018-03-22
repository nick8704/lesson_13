package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Group {

    private static final String courseName = "Java Introduction";
    private static final String dateOfTheBeginning = "30/01/2018";
    private static final byte numberOfLessons = 16;
    private static final byte numberOfLessonsInTheWeek = 2;
    public static ArrayList<Person> students = new ArrayList<>();

    public static void groupName(String courseName, String dateOfTheBeginning) {
        System.out.println(courseName + ". " + dateOfTheBeginning);
    }

    public static void dateOfStartingLastWeek(String dateOfTheBeginning, byte numberOfLessons, byte numberOfLessonsInTheWeek) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateOfTheBegginingStudy = simpleDateFormat.parse(dateOfTheBeginning);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfTheBegginingStudy);
        calendar.add(Calendar.WEEK_OF_MONTH, (int) numberOfLessons / (numberOfLessonsInTheWeek) - 1);
        int numberOfDaysInTheWeek = calendar.get(Calendar.DAY_OF_WEEK) - 2;
        calendar.add(Calendar.DAY_OF_WEEK, -numberOfDaysInTheWeek);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("The last week of the course will begin on " + dateFormat.format(calendar.getTime()) + ".");
    }

    public static ArrayList<String> makeListOfStudents(ArrayList<Person> students) {
        ArrayList<String> studentsList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            studentsList.add(students.get(i).getSecondName());
        }
        return studentsList;
    }

    public static void checkTheStudent (String secondName) {
        int tmpCount = 0;
        for (int i = 0; i < makeListOfStudents(students).size(); i++) {
            if (makeListOfStudents(students).get(i).compareTo(secondName) == 0) {
                tmpCount++;
            }
        }
        if(tmpCount == 0) {
            System.out.println("NO. Student " + secondName + " isn't in a group " + courseName + ".");
        } else {
            System.out.println("YES. Student " + secondName + " is in a group " + courseName + ".");
        }
    }

    public static String getCourseName() {
        return courseName;
    }

    public static String getDateOfTheBeginning() {
        return dateOfTheBeginning;
    }

    public static byte getNumberOfLessons() {
        return numberOfLessons;
    }

    public static byte getNumberOfLessonsInTheWeek() {
        return numberOfLessonsInTheWeek;
    }

    public static ArrayList<Person> getStudents() {
        return students;
    }
}