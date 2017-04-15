package com.fokkenrood.testcases.HelloWorldDemo;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.util.Calendar;

import org.junit.Test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.fokkenrood.drools.Automaat;

public class LAMP_UIT_TC {
	private Calendar				TODAY		= Calendar.getInstance();
	private KieServices				ks			= null;
	private KieContainer			kc			= null;
	private KieSession				ksession	= null;

	public LAMP_UIT_TC() {
		TODAY.set(2017, 1, 16);
		ks = KieServices.Factory.get();
		kc = ks.getKieClasspathContainer();
		ksession = kc.newKieSession("sessionHelloWorldDemo");
	}	// end constructor

	@Test
	public void testcase_001() throws ParseException {
		Automaat automaat = new Automaat();
		automaat.setAanwezig(false);
		ksession.insert(automaat);

		ksession.fireAllRules();
		ksession.dispose();
		assertTrue("De regel heeft NIET gevuurd", automaat.getRegel().equals("LAMP_UIT"));
	}	 // end testcase_001

	@Test
	public void testcase_002() throws ParseException {
		Automaat automaat = new Automaat();
		automaat.setDagdeel("avond");
		automaat.setTemperatuur(22);
		automaat.setAanwezig(true);
		ksession.insert(automaat);

		ksession.fireAllRules();
		ksession.dispose();
		assertTrue("De regel heeft gevuurd", !automaat.getRegel().equals("LAMP_UIT"));
	}	 // end testcase_002

}	// end class