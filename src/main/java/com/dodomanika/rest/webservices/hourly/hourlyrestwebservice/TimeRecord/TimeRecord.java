package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.TimeRecord;

import java.util.Date;
import java.util.Objects;

public class TimeRecord {
    private long id;
    private String taskName;
    private Date date;
    private Date startTime;
    private Date time;

    public TimeRecord() {
    }

    public TimeRecord(long id, String taskName, Date date, Date startTime, Date time) {
        this.id = id;
        this.taskName = taskName;
        this.date = date;
        this.startTime = startTime;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
