package org.afob.limit;

import org.afob.execution.ExecutionClient;
import org.afob.execution.Stock;
import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;


public class ExecutionClientTest {
    ExecutionClient executionClient=new ExecutionClient();
    Stock stActual=new Stock("TCS",450);

    @Test
    void buyFunTest()
    {
        Assert.assertEquals(new Stock("TCS",450),stActual);

    }


}
