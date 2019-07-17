package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.TimeRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TimeRecordResource {

    @Autowired
    private TimeResourceHardcodedService timeRecordService;

    @GetMapping("/users/{username}/dates/{date}/records")
    public List<TimeRecord> getAllTimeRecordsByDate(@PathVariable String username,
                                                    @PathVariable int date){
        return timeRecordService.findAllByDate(date);
    }

    @DeleteMapping("/users/{username}/dates/{date}/records/{id}")
    public TimeRecord deleteTimeRecord(@PathVariable String username,
                                       @PathVariable int date,
                                       @PathVariable long id){
        return timeRecordService.deleteById(id);
    }
}
