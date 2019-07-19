package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.TimeRecord;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class TimeResourceHardcodedService {

    private static List<TimeRecord> timeRecords = new ArrayList<>();
    private static int idCounter = 0;

    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    static {
        timeRecords.add(new TimeRecord(++idCounter, "domi", new Date(), "Research on technologies", "11:02", 1));
        timeRecords.add(new TimeRecord(++idCounter, "domi", new Date(), "Evaluate the Top Up functionality", "13:00", 2));
        timeRecords.add(new TimeRecord(++idCounter, "domi", new Date(), "Write the Top Up functionality", "10:10", 7));
    }

    public List<TimeRecord> findAllByDate(int dateFromToday){

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, dateFromToday);
        Date dateFromRequest = calendar.getTime();

        String formattedDate = simpleDateFormat.format(dateFromRequest);
        return timeRecords.stream()
                .filter(timeRecord -> formattedDate.equals(simpleDateFormat.format(timeRecord.getDate())))
                .collect(Collectors.toList());
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

    public TimeRecord save(int dateFromToday, TimeRecord timeRecord) {
        if (timeRecord.getId() == -1){
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_MONTH, dateFromToday);
            Date dateFromRequest = calendar.getTime();

            /*String formattedDate = simpleDateFormat.format(dateFromRequest);

            Date date = null;
            try {
                date = simpleDateFormat.parse(String.valueOf(new Date()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            try {
                date = simpleDateFormat.parse(formattedDate);

            } catch (ParseException e) {
                e.printStackTrace();
            }*/


            timeRecord.setId(++idCounter);
            timeRecord.setDate(dateFromRequest);
            timeRecords.add(timeRecord);
        } else {
            deleteById(timeRecord.getId());
            timeRecords.add(timeRecord);
        }
        return timeRecord;
    }
}
