package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
            DroolsMessage message = new DroolsMessage();
            message.setFlowStatus(DroolsMessage.PUSH);
            message.setReplyStatus(DroolsMessage.NOTREPLIED);
            DroolsCustomer customer = new DroolsCustomer();
            customer.setPushAddress("abcc830203849");
            customer.setSMSAddress("5555555555");
            customer.setSMSApproved(true);
            kSession.insert(message);
            kSession.insert(customer);
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
