package ru.x5.hw3;

public class Task_3 {
    public static void main(String[] args) {
        Student std = new Aspirant("Евгений", "Малышев", "ПР-56", 4.9, "Мобильная игра на Unity");
        Student [] students = {new Aspirant("Константин", "Фадеев", "ПР-56", 4.7, "Мобильное приложение для Android."),
                new Student("Михаил", "Смирнов", "ПР-58", 5.0)};
        for( Student st : students) {
            System.out.printf("%s %s : %d руб.\n", st.getFirstName(), st.getLastName() , st.getScholarship());
        }
    }
}

class Student{
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public String getFirstName() { 
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getGroup() {
        return group;
    }
    public double getAverageMark() {
        return averageMark;
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship(){
        if (this.averageMark == 5.0){
            return 100;
        } else {
            return 80;
        }
    }
}

class Aspirant extends Student{
    String scientificWork;
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }
    @Override
    public int getScholarship(){
        if (this.getAverageMark() == 5.0){
            return 200;
        } else {
            return 180;
        }
    }
}

