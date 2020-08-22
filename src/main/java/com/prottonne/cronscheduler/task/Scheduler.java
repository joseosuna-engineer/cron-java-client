package com.prottonne.cronscheduler.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    public Scheduler() {
        super();
    }

    @Scheduled(cron = "${cron.regex}")
    public void task() {
        // TODO
    }
}
