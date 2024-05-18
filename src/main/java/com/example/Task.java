package com.example;

import java.util.Calendar;
import java.util.Date;

public class Task {
    private String name;
    private Date dueDate;
    private Status status;
    private String comment;

    public Task(String name, Date dueDate, Status status, String comment) {
        this.name = name;
        this.dueDate = dueDate;
        this.status = status;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void requestForExtension() {
            Date currentDate = this.dueDate;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(currentDate);
            calendar.add(Calendar.DAY_OF_MONTH, 7);
            Date newDate = calendar.getTime();
            this.dueDate = newDate;
       
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', dueDate='" + dueDate + "', status=" + status + ", comment='" + comment + "'}";
    }
}
