package com.company.todolist.datamodel;

import java.time.LocalDate;

public class TodoItem {

    private String shortDescription;
    private String details;
    private LocalDate dedline;

    public TodoItem(String shortDescription, String details, LocalDate dedline) {
        this.shortDescription = shortDescription;
        this.details = details;
        this.dedline = dedline;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDedline() {
        return dedline;
    }

    public void setDedline(LocalDate dedline) {
        this.dedline = dedline;
    }

//    @Override
//    public String toString() {
//        return shortDescription;
//    }
}
