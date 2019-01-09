package org.acme.insurance.policyquote.wih;

import org.drools.compiler.kproject.ReleaseIdImpl;
import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
import org.kie.internal.runtime.Cacheable;

public class RulesWorkItemHandler implements WorkItemHandler, Cacheable {
    
    private ReleaseId releaseId;
    private KieContainer kieContainer;
    private KieScanner kieScanner;
    
    public RulesWorkItemHandler(String releaseIdStr, ClassLoader classLoader) {
        releaseId = new ReleaseIdImpl(releaseIdStr);
        KieServices ks = KieServices.Factory.get();
        kieContainer = ks.newKieContainer(releaseId, classLoader);
        kieScanner = ks.newKieScanner(kieContainer);
        kieScanner.start(10000L);
        System.out.println("Started KieScanner for releaseId : " + releaseIdStr);
    }

    @Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        
        
        System.out.println("Executing rules for releaseId " + releaseId); 
        KieSession kieSession;
        String kieSessionName = (String)workItem.getParameter("kieSession");
        if (kieSessionName == null || kieSessionName.isEmpty()) {
            System.out.println("***** WARNING ********:  value for servicetask parameter kieSession is not found!!!!  Check the data inputs assignments for your service task");
            kieSession = kieContainer.newKieSession();
        } else {
            kieSession = kieContainer.newKieSession(kieSessionName);
        }
        
        for (String param : workItem.getParameters().keySet()) {
            if (param.startsWith("fact_")) {
                kieSession.insert(workItem.getParameter(param));
            }
        }
        String processId = (String)workItem.getParameter("processId");
        if (processId != null && !processId.isEmpty()) {
            kieSession.startProcess(processId);
        }
        kieSession.fireAllRules();
        kieSession.dispose();
        manager.completeWorkItem(workItem.getId(), workItem.getParameters());         
    }

    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void close() {
        kieScanner.stop(); 
        
    }

}
