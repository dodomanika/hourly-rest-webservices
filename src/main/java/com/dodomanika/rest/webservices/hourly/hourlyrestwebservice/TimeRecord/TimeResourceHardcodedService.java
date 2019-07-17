package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.TimeRecord;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TimeResourceHardcodedService {

    private static List<TimeRecord> timeRecords = new ArrayList<>();
    private static int idCounter = 0;

    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    static {
        timeRecords.add(new TimeRecord(++idCounter, "domi", new Date(), "Research on technologies", new Date(), new Date()));
        timeRecords.add(new TimeRecord(++idCounter, "domi", new Date(), "Evaluate the Top Up functionality", new Date(), new Date()));
        timeRecords.add(new TimeRecord(++idCounter, "domi", new Date(), "Write the Top Up functionality", new Date(), new Date()));
    }

    public List<TimeRecord> findAllByDate(int dateFromToday){

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, dateFromToday);
        Date dateFromRequest = calendar.getTime();

        String formattedDate = simpleDateFormat.format(dateFromRequest);
        return timeRecords.stream()
                .filter(timeRecord -> formattedDate.equals(simpleDateFormat.format(timeRecord.getDate())))
                .collect(Collectors.toList());
        /*return timeRecords;*/
    }

    public TimeRecord deleteById(long id) {
        TimeRecord timeRecord = findById(id);

        if (timeRecord != null){
            timeRecords.remove(timeRecord);
        }
        return timeRecord;
    }

    public TimeRecord findById(long id){
        for (TimeRecord timeRecord: timeRecords){
            if (timeRecord.getId() == id){
                return timeRecord;
            }
        }
        return null;
    }

    public TimeRecord save(TimeRecord timeRecord) {
        if (timeRecord.getId() == -1){
            timeRecord.setId(++idCounter);
            timeRecords.add(timeRecord);
        } else {
            deleteById(timeRecord.getId());
            timeRecords.add(timeRecord);
        }
        return timeRecord;
    }
}
