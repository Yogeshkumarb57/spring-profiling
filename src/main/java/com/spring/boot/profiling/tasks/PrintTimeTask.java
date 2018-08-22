package com.spring.boot.profiling.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class PrintTimeTask {

    // will create scheduling task
    @Scheduled(cron = "*/3 * * * * *")
    void printTime(){

        System.out.println("SCHEDULER --> CURRENT TIME :: "+new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }
}
