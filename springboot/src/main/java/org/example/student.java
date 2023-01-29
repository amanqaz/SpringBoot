package org.example;

public class student {
    private int studentID;
    private String name;
    private  String city;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public student(int studentID, String name, String city) {
        this.studentID = studentID;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
