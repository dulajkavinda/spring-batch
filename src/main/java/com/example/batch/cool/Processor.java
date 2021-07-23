package com.example.batch.cool;

import org.springframework.batch.item.ItemProcessor;

import java.util.Locale;

public class Processor implements ItemProcessor<String,String> {
    @Override
    public String process(String item) throws Exception {
        System.out.println("inside process");
        return "PROCESS " + item.toUpperCase();
    }
}
