package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Tasklist1", "Some tasks");
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> resultList = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, resultList.size());

        //Cleanup
        int id = resultList.get(0).getId();
        taskListDao.delete(id);
    }
}
