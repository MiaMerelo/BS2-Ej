package com.vogella.spring.di.model;

import org.springframework.stereotype.Service;

@Service
public class NiceWriter implements IWriter{
    @Override
    public void writer (String s){
        System.out.println("The string is " + s);
    }
}
