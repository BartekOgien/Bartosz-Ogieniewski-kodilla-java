package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("Tasklist1")
    TaskList taskList1;

    @Autowired
    @Qualifier("Tasklist2")
    TaskList taskList2;

    @Autowired
    @Qualifier("Tasklist3")
    TaskList taskList3;

    @Bean
    public Board getBoard() {
        return new Board(taskList1, taskList2, taskList3);
    }

    @Bean(name = "Tasklist1")
    public TaskList getTasklistOne() {
        return new TaskList();
    }

    @Bean(name = "Tasklist2")
    public TaskList getTasklistTwo() {
        return new TaskList();
    }

    @Bean(name = "Tasklist3")
    public TaskList getTasklistThree() {
        return new TaskList();
    }
}
