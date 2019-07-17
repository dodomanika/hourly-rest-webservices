package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.TimeRecord;

import java.util.Date;
import java.util.Objects;

public class TimeRecord {
    private long id;
    private String username;
    private Date date;
    private String taskName;
    private Date startTime;
    private Date time;

    public TimeRecord() {
    }

    public TimeRecord(long id, String username, Date date, String taskName, Date startTime, Date time) {
        this.id = id;
        this.username = username;
        this.date = date;
        this.taskName = taskName;
        this.startTime = startTime;
        this.time = time;
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

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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
