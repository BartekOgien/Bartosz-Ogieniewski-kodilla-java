package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;

import static org.mockito.Mockito.when;


public class StatisticsCalculatorTestSuite {
    @Test
    public void testCalculateAdvStatisticsPostsZeroCommentsZero() {
        //Given
        Statistics mockStatistics = Mockito.mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<String>();
        userList.add("Zenek");
        userList.add("Zdzicho");
        userList.add("Ziutek");
        userList.add("Zonk");
        when(mockStatistics.usersNames()).thenReturn(userList);
        when(mockStatistics.postsCount()).thenReturn(0);
        when(mockStatistics.commentsCount()).thenReturn(0);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(0/0, statisticsCalculator.averageCommentsperPost, 0.1);
        Assert.assertEquals(0/5, statisticsCalculator.averageCommentsPerUser, 0.1);
        Assert.assertEquals(0/5, statisticsCalculator.averagePostsperUser, 0.1);
    }


    @Test
    public void testCalculateAdvStatisticsPosts() {
        //Given
        Statistics mockStatistics = Mockito.mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<String>();
        userList.add("Zenek");
        userList.add("Zdzicho");
        userList.add("Ziutek");
        userList.add("Zonk");
        userList.add("Zerg");
        when(mockStatistics.usersNames()).thenReturn(userList);
        when(mockStatistics.postsCount()).thenReturn(1000);
        when(mockStatistics.commentsCount()).thenReturn(100);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(100/1000, statisticsCalculator.averageCommentsperPost, 0.1);
        Assert.assertEquals(100/5, statisticsCalculator.averageCommentsPerUser, 0.1);
        Assert.assertEquals(1000/5, statisticsCalculator.averagePostsperUser, 0.1);
    }

    @Test
    public void testCalculateAdvStatisticsUsersZero() {
        //Given
        Statistics mockStatistics = Mockito.mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<String>();
        when(mockStatistics.usersNames()).thenReturn(userList);
        when(mockStatistics.postsCount()).thenReturn(5);
        when(mockStatistics.commentsCount()).thenReturn(5);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(5/5, statisticsCalculator.averageCommentsperPost, 0.1);
        Assert.assertEquals(5/0, statisticsCalculator.averageCommentsPerUser, 0.1);
        Assert.assertEquals(5/0, statisticsCalculator.averagePostsperUser, 0.1);
    }

    @Test
    public void testCalculateAdvStatisticsUsersHoundred() {
        //Given
        Statistics mockStatistics = Mockito.mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<String>();
        for (int i=0; i<100; i++) {
            userList.add("user" + i);
        }
        when(mockStatistics.usersNames()).thenReturn(userList);
        when(mockStatistics.postsCount()).thenReturn(100);
        when(mockStatistics.commentsCount()).thenReturn(300);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(300/100, statisticsCalculator.averageCommentsperPost, 0.1);
        Assert.assertEquals(300/100, statisticsCalculator.averageCommentsPerUser, 0.1);
        Assert.assertEquals(100/100, statisticsCalculator.averagePostsperUser, 0.1);
    }
}
