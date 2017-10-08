package com.kodilla.spring.Portfolio;

import com.kodilla.spring.portfolio.Board;
import com.kodilla.spring.portfolio.BoardConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().getTasks().add("Done task");
        board.getInProgressList().getTasks().add("Progress task");
        board.getToDoList().getTasks().add("To do task");
        //Then
        Assert.assertEquals(board.getDoneList().getTasks().get(0), "Done task");
        System.out.println(board.getDoneList().getTasks().get(0));
        Assert.assertEquals(board.getInProgressList().getTasks().get(0), "Progress task");
        System.out.println(board.getInProgressList().getTasks().get(0));
        Assert.assertEquals(board.getToDoList().getTasks().get(0), "To do task");
        System.out.println(board.getToDoList().getTasks().get(0));
    }
}
