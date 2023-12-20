package com.example.recyclerview;

public class JobDetails {
    private int id;
    private String details;
    private boolean bold;
    private int job;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }
}
