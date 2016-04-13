package org.specialtripsagency.event;

import org.jbpm.workflow.instance.node.WorkItemNodeInstance;
import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;
import org.kie.api.runtime.process.NodeInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookingWSProcessEventListener implements ProcessEventListener {
    
    private static Logger log = LoggerFactory.getLogger("WS Audit");

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
        NodeInstance node = event.getNodeInstance();
        if (node instanceof WorkItemNodeInstance) {
            WorkItemNodeInstance wiNode = (WorkItemNodeInstance) node;
            if ("WebService".equals(wiNode.getWorkItem().getName())) {
                String wsInterface = (String) wiNode.getWorkItem().getParameter("Interface");
                String wsOperation = (String) wiNode.getWorkItem().getParameter("Operation");
                String wsUrl = (String) wiNode.getWorkItem().getParameter("Url");
                log.info("WS invoked - Url: {}, Interface: {}, Operation: {}", wsUrl, wsInterface, wsOperation);
            }
        }
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
