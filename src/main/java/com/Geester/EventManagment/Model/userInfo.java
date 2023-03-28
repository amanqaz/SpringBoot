package com.Geester.EventManagment.Model;

import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeSerializer;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.time.ZonedDateTime;

@Component

public class userInfo {
    private int studentId;
    private String firstName;
    private String lastName;
    private String department;
    private String branch;
    private String description;
    private String entryTime="09:00:00"  ;
    private String endTime ="12:00:00";

    public int getStudentId() {
        return studentId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getEndTime() {
        return endTime;
    }



    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
