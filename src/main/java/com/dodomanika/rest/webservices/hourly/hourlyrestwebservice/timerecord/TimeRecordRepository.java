package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.timerecord;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TimeRecordRepository extends JpaRepository<TimeRecord, Long> {
    List<TimeRecord> findAllByDate(LocalDate date);
}
