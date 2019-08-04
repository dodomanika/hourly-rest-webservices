package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.timerecord;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRecordRepository extends JpaRepository<TimeRecord, Long> {
}
