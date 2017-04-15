package com.fokkenrood.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.fokkenrood.drools.Automaat;

public class MyKieService {
	static String request	= "";
	static String response	= "";

	public static void main(String[] args) throws IOException {
		System.out.println("Hello Drools KIE world...");
		
		ServerSocket listener = new ServerSocket();
		listener.bind(new InetSocketAddress("localhost", 8888));
		System.out.println("My KIE service is listening for requests...");

		while (!request.equals("STOP")) {
			Socket socket = listener.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			readRequest(br);
			writeResponse(bw);

			bw.close();
			br.close();
		}	// end while

		listener.close();
		System.out.println("Bye!");
	}	// end main
	
	
	private static void readRequest(BufferedReader reader) throws IOException {
		request = "";
		while (true) {
			String line = reader.readLine();
			if (line.equals("")) { break; }
			request += line;
		}	// end while
		System.out.println("-- request: '" + request + "'");
	}	// end readRequest
	
	private static void writeResponse(BufferedWriter writer) throws IOException {
		response = "";
		if (request.startsWith("JSON:")) {
			roepBelisServiceAan();
			writer.write(response);
			writer.write("\n\n");
			return;
		}	// end if
		
		writer.write("<br/><br/>\n");
		if (request.equals("STOP")) {
			writer.write("<h1>the service has stopped !!!</h1>\n");
		} else {
			writer.write("<h1>My Kie Service is running ...</h1>\n");
		}	// end if
		writer.write("<p align=\"center\">@ " + Calendar.getInstance().getTime() + "</p>\n");
		writer.write("\n");
	}	// end writeResponse
	
	
	private static void roepBelisServiceAan() {
		//	setup a KIE-service and a KIE-session:	
		KieServices ks = KieServices.Factory.get();
		KieContainer kc = ks.getKieClasspathContainer();
		KieSession ksession = kc.newKieSession("sessionHelloWorldDemo");
		
//		//	voeg feit toe aan de sessie:
		String json[] = request.split("\"");
		Automaat automaat = new Automaat();
		automaat.setDagdeel(json[5]);
		automaat.setTemperatuur(Integer.parseInt(json[9]));
		automaat.setAanwezig(json[13].equals("ja") ? true : false);
		ksession.insert(automaat);
		
		//	execute rule engine:
		ksession.fireAllRules();

		//	formeer JSON response string:
		response += "{\"automaat\":{";
		response += "\"regel\":\"" + automaat.getRegel() + "\"";
		response += ",\"status\":\"" + automaat.getStatus() + "\"";
		response += "}}";

		ksession.dispose();
	}	// end roepBelisServiceAan

}	// end class
