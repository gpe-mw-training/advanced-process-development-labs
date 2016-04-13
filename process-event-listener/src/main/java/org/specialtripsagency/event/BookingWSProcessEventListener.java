package org.specialtripsagency.event;

import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;

public class BookingWSProcessEventListener implements ProcessEventListener {

    @Override
    public void beforeProcessStarted(ProcessStartedEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterProcessStarted(ProcessStartedEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void beforeProcessCompleted(ProcessCompletedEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterProcessCompleted(ProcessCompletedEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void beforeNodeLeft(ProcessNodeLeftEvent event) {
        // TODO Auto-generated method stub
    }

    @Override
    public void afterNodeLeft(ProcessNodeLeftEvent event) {
        // Hints:
        // * node instance type = WorkItemNodeInstance
        // * WorkItem name = "WebService"
        // * WorkItem has Map<String, Object> parameters
    }

    @Override
    public void beforeVariableChanged(ProcessVariableChangedEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterVariableChanged(ProcessVariableChangedEvent event) {
        // TODO Auto-generated method stub

    }

}
