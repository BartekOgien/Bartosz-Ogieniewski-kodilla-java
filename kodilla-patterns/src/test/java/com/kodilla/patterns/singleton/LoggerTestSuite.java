package com.kodilla.patterns.singleton;

import com.kodilla.patterns.sigleton.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLog() {
        //Given
        //When
        Logger.getInstance().log("Log1");
        String logResult = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(logResult, "Log1");
    }

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("Log2");
        //When
        String resultgetLastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(resultgetLastLog, "Log2");
    }
}
