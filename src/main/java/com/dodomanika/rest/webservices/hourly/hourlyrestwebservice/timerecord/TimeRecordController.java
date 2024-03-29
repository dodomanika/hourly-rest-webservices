package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.timerecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TimeRecordController {

    @Autowired
    private TimeRecordRepository repository;

    @GetMapping("/users/{username}/dates/{date}/records")
    public List<TimeRecord> getAllTimeRecordsByDate(@PathVariable String username,
                                                    @PathVariable int date){
        LocalDate day = LocalDate.now().plusDays(date);

        return repository.findAllByDate(day);
    }

    @GetMapping("/users/{username}/dates/{date}/records/{id}")
    public Optional<TimeRecord> getTimeRecord(@PathVariable String username,
                                              @PathVariable int date,
                                              @PathVariable long id){
        return repository.findById(Long.valueOf(id));
    }

    @DeleteMapping("/users/{username}/dates/{date}/records/{id}")
    public void deleteTimeRecord(@PathVariable String username,
                                       @PathVariable int date,
                                       @PathVariable long id){
        repository.deleteById(Long.valueOf(id));
    }

    @PostMapping("/users/{username}/dates/{date}/records")
    public ResponseEntity<Void> updateTimeRecord(@PathVariable String username,
                                       @PathVariable int date,
                                       @RequestBody TimeRecord timeRecord){
        LocalDate day = LocalDate.now().plusDays(date);
        timeRecord.setDate(day);
        TimeRecord createdRecord = repository.save(timeRecord);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(createdRecord.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/users/{username}/dates/{date}/records/{id}")
    public TimeRecord updateTimeRecord(@PathVariable String username,
                                       @PathVariable int date,
                                       @PathVariable long id,
                                       @RequestBody TimeRecord timeRecord){
        LocalDate day = LocalDate.now().plusDays(date);
        timeRecord.setDate(day);
        return repository.save(timeRecord);
    }
}
