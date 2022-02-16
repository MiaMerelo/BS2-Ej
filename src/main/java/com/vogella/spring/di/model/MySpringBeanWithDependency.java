package com.vogella.spring.di.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vogella.spring.di.model.IWriter;

@Service
public class MySpringBeanWithDependency {
    private IWriter writer;

    @Autowired
    public void setWriter(IWriter writer) {
        this.writer = writer;
    }

    public void run() {
        String s = "This is my test";
        writer.writer(s);
    }
}
