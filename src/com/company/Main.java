package com.company;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println(Person.fullName("Nikonets", "Alexandr", "Sergeevich"));
        System.out.println(Person.abbreviatedName("Nikonets", "Alexandr", "Sergeevich"));
        System.out.println(Person.age("26/02/1987"));
        Person me = new Person("Nikonets Alexandr Sergeevich");
        Group.groupName(Group.getCourseName(), Group.getDateOfTheBeginning());
        Group.dateOfStartingLastWeek(Group.getDateOfTheBeginning(), Group.getNumberOfLessons(), Group.getNumberOfLessonsInTheWeek());
        Group.students.add(new Person("Ivanov","Ivan","Ivanovich"));
        Group.students.add(new Person("Petrov","Petr","Petrovich"));
        Group.students.add(new Person("Sidorov","Semen","Semenovich"));
        Group.students.add(new Person("Popov","Viktor","Andreevich"));
        Group.students.add(new Person("Nikonets","Aleksandr","Sergeevich"));
        for (int i = 0; i < Group.makeListOfStudents(Group.getStudents()).size(); i++) {
            System.out.println((i + 1) + ". " + Group.makeListOfStudents(Group.getStudents()).get(i));
        }
        Group.checkTheStudent("Sidorov");
        Group.checkTheStudent("Ugrumiy");
    }
}