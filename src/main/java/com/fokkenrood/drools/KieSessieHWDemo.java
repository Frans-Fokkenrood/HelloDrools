package com.fokkenrood.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class KieSessieHWDemo {

	public static void main(String[] args) {
		System.out.println("Start KIE sessie voor Hello World DEMO...");
		
		//	setup a KIE-service and a KIE-session:	
		KieServices ks = KieServices.Factory.get();
		KieContainer kc = ks.getKieClasspathContainer();
		KieSession ksession = kc.newKieSession("sessionHelloWorldDemo");
		
		//	voeg feit toe aan de sessie:
		Automaat automaat = new Automaat();
		automaat.setMoment("morgen");
		automaat.setTemperatuur(22);
		automaat.setAanwezig(true);
		ksession.insert(automaat);
		
		//	execute rule engine:
		ksession.fireAllRules();
		if (automaat.getAutomaatID() != null) {
			System.out.println("- De regel '" + automaat.getAutomaatID() + "' heeft gevuurd; "
					+ "de lamp staat '" + automaat.getStatus().toUpperCase() + "'...");
		}	// end if
		ksession.dispose();
		
		System.out.println("Ready!");
	}	// end main

}	// end class
