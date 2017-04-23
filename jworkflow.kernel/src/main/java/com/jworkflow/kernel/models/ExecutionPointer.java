package com.jworkflow.kernel.models;

import java.util.Date;

public class ExecutionPointer {
    public String id;
    public int stepId;
    public boolean active;
    public Date sleepUntilUtc;
    public Object persistenceData;
    public Date startTimeUtc;
    public Date endTimeUtc;
    public String eventName;
    public String eventKey;
    public boolean eventPublished;
    public Object eventData;
    public int concurrentFork;
    public boolean pathTerminator;
        
}
