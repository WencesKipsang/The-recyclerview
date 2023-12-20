package com.example.recyclerview;

import android.location.Location;

import java.util.List;

public class ApiResponse {
    private int id;
    private String title;
    private String link;
    private Location location;
    private JobType job_type;
    private JobFunction job_function;
    private Industries industries;
    private List<JobDetails> job_details;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public JobType getJob_type() {
        return job_type;
    }

    public void setJob_type(JobType job_type) {
        this.job_type = job_type;
    }

    public JobFunction getJob_function() {
        return job_function;
    }

    public void setJob_function(JobFunction job_function) {
        this.job_function = job_function;
    }

    public Industries getIndustries() {
        return industries;
    }

    public void setIndustries(Industries industries) {
        this.industries = industries;
    }

    public List<JobDetails> getJob_details() {
        return job_details;
    }

    public void setJob_details(List<JobDetails> job_details) {
        this.job_details = job_details;
    }
}
