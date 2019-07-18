package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.TimeRecord;

import java.util.Date;
import java.util.Objects;

public class TimeRecord {
    private long id;
    private String username;
    private Date date;
    private String task;
    private String startTime;
    private long duration;

    public TimeRecord() {
    }

    public TimeRecord(long id, String username, Date date, String task, String startTime, long duration) {
        this.id = id;
        this.username = username;
        this.date = date;
        this.task = task;
        this.startTime = startTime;
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeRecord that = (TimeRecord) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
