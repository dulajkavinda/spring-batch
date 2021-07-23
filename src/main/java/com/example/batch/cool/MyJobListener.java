package com.example.batch.cool;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("job started");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("job ended " + jobExecution.getStatus().toString());
    }
}
