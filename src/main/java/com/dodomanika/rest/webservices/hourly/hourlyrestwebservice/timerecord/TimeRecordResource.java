package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.timerecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @GetMapping("/users/{username}/dates/{date}/records/{id}")
    public TimeRecord getTimeRecord(@PathVariable String username,
                                       @PathVariable int date,
                                       @PathVariable long id){
        return timeRecordService.findById(id);
    }

    @DeleteMapping("/users/{username}/dates/{date}/records/{id}")
    public TimeRecord deleteTimeRecord(@PathVariable String username,
                                       @PathVariable int date,
                                       @PathVariable long id){
        return timeRecordService.deleteById(id);
    }

    @PostMapping("/users/{username}/dates/{date}/records")
    public ResponseEntity<Void> updateTimeRecord(@PathVariable String username,
                                       @PathVariable int date,
                                       @RequestBody TimeRecord timeRecord){
        TimeRecord createdRecord = timeRecordService.save(date, timeRecord);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(createdRecord.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/users/{username}/dates/{date}/records/{id}")
    public TimeRecord updateTimeRecord(@PathVariable String username,
                                       @PathVariable int date,
                                       @PathVariable long id,
                                       @RequestBody TimeRecord timeRecord){
        return timeRecordService.save(date, timeRecord);
    }
}
