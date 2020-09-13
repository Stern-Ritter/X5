package ru.x5.hw3.Task3;

public class MainClass {
    public static void main(String[] args) {
        Student std = new Aspirant("Евгений", "Малышев", "ПР-56", 4.9, "Мобильная игра на Unity");
        Student [] students = {new Aspirant("Константин", "Фадеев", "ПР-56", 4.7, "Мобильное приложение для Android."),
                new Student("Михаил", "Смирнов", "ПР-58", 5.0)};
        for( Student st : students) {
            System.out.printf("%s %s : %d руб.\n", st.getFirstName(), st.getLastName() , st.getScholarship());
        }
    }
}