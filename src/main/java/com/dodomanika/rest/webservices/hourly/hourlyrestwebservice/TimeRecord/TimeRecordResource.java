package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.TimeRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TimeRecordResource {

    @Autowired
    private TimeResourceHardcodedService timeRecordService;

    @GetMapping("/users/{username}/dates/{date}")
    public List<TimeRecord> getAllTimeRecordsByDate(@PathVariable String username,
                                                    @PathVariable int date){
        return timeRecordService.findAllByDate(date);
    }
}
