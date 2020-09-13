package ru.x5.hw3.Task3;

public class Aspirant extends Student {
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