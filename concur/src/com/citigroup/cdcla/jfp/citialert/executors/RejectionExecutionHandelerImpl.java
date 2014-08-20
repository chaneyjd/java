package com.citigroup.cdcla.jfp.citialert.executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

class RejectedExecutionHandelerImpl implements RejectedExecutionHandler
{
    public void rejectedExecution(Runnable runnable,
            ThreadPoolExecutor executor)
    {
        System.out.println(runnable.toString() + " : I've been rejected ! ");
    }
}