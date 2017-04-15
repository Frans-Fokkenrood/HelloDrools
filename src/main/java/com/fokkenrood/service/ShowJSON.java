package com.fokkenrood.service;

public class ShowJSON {
	public static void main(String[] args) {
		String jsonString = "{\"automaat\":{\"dagdeel\":\"morgen\",\"temperatuur\":\"20\",\"aanwezig\":\"ja\"}}";
        
		String json[] = jsonString.split("\"");
		System.out.println(json[5]);
		System.out.println(json[9]);
		System.out.println(json[13]);
		
 	}	// end main
}	// end class
